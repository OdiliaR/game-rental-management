/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rademakers_game_rental_management.logica;

import java.util.List;
import java.util.ArrayList;
import rademakers_game_rental_management.objectes.Usuari;

/**
 *
 * @author Usuario
 */
public class LogicaNegoci {
    private static List<Usuari> usuaris = new ArrayList<>();
    
    public static void afegirUsuari(Usuari usuari) {
        usuaris.add(usuari);
    }
    
    public static Usuari cercarUsuari (String nomUsuari) {
        //Aquest mètode (només) torna la primera coincidència del nom.
        for (Usuari usuari:usuaris) {
            try {
                if (usuari.getNomUsuari().equalsIgnoreCase(nomUsuari)) {
                    return usuari;
                }  
            }catch (Exception e) {
                System.out.println("No s'ha trobat aquest usuari:\n" + nomUsuari);
            }
        }
        return null;
    }
    
    public static String esborrarUsuari (Usuari usuari) {
        
        String nomUsuari= usuari.getNomUsuari();
        
        if (usuaris.contains(usuari)){
            usuaris.remove(usuari);
            return "S'ha esborrat aquest usuari correctament:\n"+ nomUsuari;
        }else{
            return "No s'ha trobat aquest usuari:\n" + nomUsuari;
        }
        
    }

    public static List<Usuari> getUsuaris() {
        return usuaris;
    }
    
    
}