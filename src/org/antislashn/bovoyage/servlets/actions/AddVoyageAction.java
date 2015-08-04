package org.antislashn.bovoyage.servlets.actions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.antislashn.bovoyage.Constantes;
import org.antislashn.bovoyage.entities.Destination;
import org.antislashn.bovoyage.metier.Caddy;
import org.antislashn.bovoyage.metier.Voyage;
import org.antislashn.bovoyage.servlets.Action;

public class AddVoyageAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		int id = Integer.parseInt(request.getParameter("id"));
		Destination destination = (Destination) session.getAttribute(Constantes.DESTINATION);
		Caddy caddy = (Caddy) session.getAttribute(Constantes.CADDY);
		Voyage voyage = new Voyage();
		voyage.setDatesVoyage(destination.getDatesVoyage(id));
		voyage.setNbVoyageurs(1);
		voyage.setRegion(destination.getRegion());
		caddy.add(voyage);
		
		// Pour synchronisation cluster
		session.setAttribute(Constantes.CADDY, caddy);
		
		return "/show_caddy.jsp";
	}

}
