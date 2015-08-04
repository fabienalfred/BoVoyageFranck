package org.antislashn.bovoyage.servlets.actions;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.antislashn.bovoyage.Constantes;
import org.antislashn.bovoyage.dao.DestinationDAO;
import org.antislashn.bovoyage.entities.Destination;
import org.antislashn.bovoyage.servlets.Action;

public class DetailsDestinationAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		DestinationDAO dao = (DestinationDAO) request.getServletContext().getAttribute(Constantes.DESTINATION_DAO);
		String id = request.getParameter("id");
		Destination destination = dao.getDestinationById(id);
		destination.setDatesVoyages(dao.getDatesVoyages(destination));
		destination.setImages(dao.getImages(destination));
		session.setAttribute(Constantes.DESTINATION, destination);
		return "/details.jsp";
	}

}
