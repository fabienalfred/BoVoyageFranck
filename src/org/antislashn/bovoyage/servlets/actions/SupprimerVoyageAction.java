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

public class SupprimerVoyageAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		int index = Integer.parseInt(request.getParameter("voy"));
		Caddy caddy = (Caddy) session.getAttribute(Constantes.CADDY);
		caddy.remove(index);
		
		// Pour synchronisation cluster
		session.setAttribute(Constantes.CADDY, caddy);
		return "/show_caddy.jsp";
	}

}
