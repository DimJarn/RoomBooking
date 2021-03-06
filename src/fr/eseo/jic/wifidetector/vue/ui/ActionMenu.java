package fr.eseo.jic.wifidetector.vue.ui;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;


public class ActionMenu extends AbstractAction{
	private static final long serialVersionUID = 1L;

	public static final String NOM_ACTION_INFO_RESEAU = "Info reseau";
	public static final String NOM_ACTION_CARTOGRAPHIER = "Cartographie du réseau wifi";
	public static final String NOM_ACTION_FENETRE_START= "Start";
	
	public static final String NOM_ACTION_RETOUR = "Retour au menu";
	public static final String NOM_ACTION_RETOUR_MENU = "Retour menu";
	
	public static final String NOM_ACTION_FERMER = "Fermer fenetre";
	public static final String NOM_ACTION_CLOSE = "Fermer WifiDetector";
	
	public static final String NOM_ACTION_SETTING = "Settings";
	
	
	public ActionMenu(){
		super();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		
		if(event.getActionCommand() == NOM_ACTION_INFO_RESEAU){
			System.out.println("Info reseau");
			FenetreWifiDetector.getInstance().setVisible(true);
			FenetreMenu.getInstance().setVisible(false);
		} 
		
		if(event.getActionCommand() == NOM_ACTION_CARTOGRAPHIER){
			System.out.println("Carto wifi");
			FenetreCartographieWifi.getInstance().setVisible(true);
			FenetreMenu.getInstance().setVisible(false);
		}
		
		if(event.getActionCommand() == NOM_ACTION_FENETRE_START){
			System.out.println("Menu");
			FenetreMenu.getInstance().setVisible(true);
			FenetreAccueil.getInstance().setVisible(false);
		}
		
		if(event.getActionCommand() == NOM_ACTION_RETOUR){
			System.out.println("Retour menu apres info");
			FenetreWifiDetector.getInstance().setVisible(false);
			FenetreMenu.getInstance().setVisible(true);
		} 
		
		if(event.getActionCommand() == NOM_ACTION_RETOUR_MENU){
			System.out.println("Retour menu apres carto");
			FenetreCartographieWifi.getInstance().setVisible(false);
			FenetreMenu.getInstance().setVisible(true);
		} 
		
		if(event.getActionCommand() == NOM_ACTION_CLOSE){
			System.exit(0);
		} 
		
		
		if(event.getActionCommand() == NOM_ACTION_SETTING){
			//FenetrePreference.getInstance().setVisible(true);

		} 
		
		if(event.getActionCommand() == NOM_ACTION_FERMER){
			//FenetreWifiDetection.getInstance().dispose();
			FenetreWifiDetector.getInstance().setVisible(false);
			//FenetreWifiDetection.instance = null;

			//FenetreWifiDetection.getInstance().setVisible(false);
			FenetreMenu.getInstance().setVisible(true);

		} 
		
	}

}
