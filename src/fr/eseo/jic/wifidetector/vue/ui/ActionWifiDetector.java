package fr.eseo.jic.wifidetector.vue.ui;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;


public class ActionWifiDetector extends AbstractAction{
private static final long serialVersionUID = 1L;
	
	public static final String NOM_ACTION_CALIBRER = "Calibrer";
	public static final String NOM_ACTION_MENU = "Vers Menu";

	
	public ActionWifiDetector(){
		super();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand() == NOM_ACTION_MENU){
			FenetreMenu.getInstance().setVisible(true);
			FenetreWifiDetector.getInstance().setVisible(false);
		} 
		
		if(e.getActionCommand() == NOM_ACTION_CALIBRER){
			// CALIBRATION EYE TRACKING !!!!
			FenetreWifiDetector.getInstance().setVisible(false);
			//WarningFlora.getInstance().setVisible(true);
		}
		
		
	}
}

