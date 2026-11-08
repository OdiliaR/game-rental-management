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
        if (!usuaris.contains(usuari)) {
            usuaris.add(usuari);
        }else{
            System.out.println("Aquest usuari ja existeix al sistema.");
        }
    }
    
    public static Usuari cercarUsuari (String dni) {
        //Aquest mètode (només) torna la primera coincidència del nom.
        for (Usuari usuari:usuaris) {
            try {
                if (usuari.getDni().equalsIgnoreCase(dni)) {
                    return usuari;
                }  
            }catch (Exception e) {
                System.out.println("No s'ha trobat l'usuari amb DNI " + dni + ".");
            }
        }
        return null;
    }
    
    public static Usuari esborrarUsuari (Usuari usuari) {
        
        for (Usuari u : usuaris) {

            if (u.getDni().equalsIgnoreCase(usuari.getDni())) {
                return u;
            }
        }

        return null;
    }

    public static List<Usuari> getUsuaris() {
        return usuaris;
    }
    
    
}