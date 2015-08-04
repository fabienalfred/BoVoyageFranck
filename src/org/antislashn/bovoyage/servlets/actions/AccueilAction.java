package org.antislashn.bovoyage.servlets.actions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.antislashn.bovoyage.Constantes;
import org.antislashn.bovoyage.dao.DestinationDAO;
import org.antislashn.bovoyage.entities.Destination;
import org.antislashn.bovoyage.metier.DestinationTO;
import org.antislashn.bovoyage.servlets.Action;

public class AccueilAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext application = request.getServletContext();
		DestinationDAO destinationDAO = (DestinationDAO) application.getAttribute(Constantes.DESTINATION_DAO);
		
		List<DestinationTO> destinations = new ArrayList<>();
		for(Destination d : destinationDAO.getAllDestinations()){
			DestinationTO dto = new DestinationTO(d);
			List<String> images = destinationDAO.getImages(d);
			dto.setImage(images.get(0));
			destinations.add(dto);
		}
		request.setAttribute("destinations", destinations);
		return "/accueil.jsp";
	}

}
