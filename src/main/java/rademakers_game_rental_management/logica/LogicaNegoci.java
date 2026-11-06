/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rademakers_game_rental_management.logica;

import java.awt.List;
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

    public static List<Usuari> getUsuaris() {
        return Usuaris;
    }
    
    
}