package org.antislashn.bovoyage.servlets;

import org.antislashn.bovoyage.servlets.actions.AccueilAction;
import org.antislashn.bovoyage.servlets.actions.AddVoyageAction;
import org.antislashn.bovoyage.servlets.actions.ChangerNombreVoyageursAction;
import org.antislashn.bovoyage.servlets.actions.DetailsDestinationAction;
import org.antislashn.bovoyage.servlets.actions.SupprimerVoyageAction;

public class ActionFactory {
	public interface Type{
		public static final String ACCUEIL = "accueil";
		public static final String DETAILS = "details";
		public static final String COMMANDER = "cde";
		public static final String CHANGER_NB_VOYAGEURS = "chgt";
		public static final String SUPPRIMER_VOYAGE = "del";
	}
	public static Action getAction(String cde){
		Action action = null;
		if(cde==null || cde.isEmpty())
			cde = Type.ACCUEIL;
		switch(cde){
		case Type.ACCUEIL :
			action = new AccueilAction();
			break;
		case Type.DETAILS:
			action = new DetailsDestinationAction();
			break;
		case Type.COMMANDER:
			action = new AddVoyageAction();
			break;
		case Type.CHANGER_NB_VOYAGEURS:
			action = new ChangerNombreVoyageursAction();
			break;
		case Type.SUPPRIMER_VOYAGE:
			action = new SupprimerVoyageAction();
			break;
		}
		
		
		return action;
	}
}
