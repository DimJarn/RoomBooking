package fr.eseo.jic.wifidetector.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AdresseClient {
//Pour obtenir l'adresse local d'une machine
	//retourne le nom de la machine et son adresse IP

    public static void main(String[] args) {
  
        String nomHote ;
        String adresseIPLocale ;

        try{
           InetAddress inetadr = InetAddress.getLocalHost();
           //nom de machine
           nomHote = (String) inetadr.getHostName();
           System.out.println("Nom de la machine = "+nomHote );
           //adresse ip sur le réseau
           adresseIPLocale = (String) inetadr.getHostAddress();
           System.out.println("Adresse IP locale = "+adresseIPLocale );
   
        } catch (UnknownHostException e) {
               e.printStackTrace();
        }
    }
}
