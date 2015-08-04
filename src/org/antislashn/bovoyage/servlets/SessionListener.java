package org.antislashn.bovoyage.servlets;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.antislashn.bovoyage.Constantes;
import org.antislashn.bovoyage.metier.Caddy;

/**
 * Application Lifecycle Listener implementation class SessionListener
 *
 */
@WebListener
public class SessionListener implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent evt)  { 
    	HttpSession session = evt.getSession();
    	session.setAttribute(Constantes.CADDY, new Caddy());
    }


    public void sessionDestroyed(HttpSessionEvent evt)  { 
         // TODO Auto-generated method stub
    }
	
}
