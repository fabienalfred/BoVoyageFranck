package org.antislashn.bovoyage.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

import org.antislashn.bovoyage.entities.DatesVoyage;
import org.antislashn.bovoyage.entities.Destination;

public class DestinationDAO {
	private EntityManagerFactory emf;
	private static final Logger log = Logger.getAnonymousLogger();
	
	public DestinationDAO() {
		emf = Persistence.createEntityManagerFactory("bovoyage");
	}
	
	@SuppressWarnings("unchecked")
	public List<Destination> getAllDestinations(){
		EntityManager em = emf.createEntityManager();
		Query query = em.createNamedQuery("Destination.all");
		List<Destination> destinations = query.getResultList();
		em.close();
		return destinations;
	}
	
	public Destination getDestinationById(long id){
		EntityManager em = emf.createEntityManager();
		Destination destination = em.find(Destination.class, id);
		em.close();
		return destination;
	}
	
	public Destination getDestinationById(String ids){
		try{
			long id = Long.parseLong(ids);
			return getDestinationById(id);
		}catch(NumberFormatException e){
			log.severe("<<< "+e.getLocalizedMessage());
			return null;
		}
	}
	
	public List<String> getImages(Destination destination){
		EntityManager em = emf.createEntityManager();
		Destination d = em.merge(destination);
		List<String> images = new ArrayList<>(d.getImages());
		em.close();
		return images;
	}
	
	public List<DatesVoyage> getDatesVoyages(Destination destination){
		EntityManager em = emf.createEntityManager();
		Destination d = em.merge(destination);
		List<DatesVoyage> dates = new ArrayList<>(d.getDatesVoyages());
		em.close();
		return dates;
	}
}
