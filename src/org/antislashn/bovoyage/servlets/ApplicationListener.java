package org.antislashn.bovoyage.servlets;

import java.util.logging.Logger;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.antislashn.bovoyage.Constantes;
import org.antislashn.bovoyage.dao.DestinationDAO;

/**
 * Application Lifecycle Listener implementation class ApplicationListener
 *
 */
@WebListener
public class ApplicationListener implements ServletContextListener {
	private static final Logger log = Logger.getAnonymousLogger();
	
    public void contextDestroyed(ServletContextEvent event)  { 

    }


    public void contextInitialized(ServletContextEvent event)  { 
        ServletContext application = event.getServletContext();
        DestinationDAO destinationDAO = new DestinationDAO();
        application.setAttribute(Constantes.DESTINATION_DAO, destinationDAO);
        log.info(">>> destinationDAO ajouté au contexte applicatif");
    }
	
}
