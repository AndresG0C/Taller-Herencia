/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import Model.Entrenador;
import Model.Equipo;
import Model.Futbolista;
import Model.Masajista;

/**
 *
 * @author ESTUDIANTES
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Equipo Equipe = new Equipo(98987878, "FCB", " Barça", 124);
        Futbolista Jugador = new Futbolista(12345, "Robert", "Lewandowski", 34, 9, "Nike");
        Entrenador Tecnico = new Entrenador("FCB Barcelona", 12131415, "Xavi", "Hernandez", 43);
        Masajista Masajista = new Masajista("Masajista", 49, 654321, "Ángel", "Mur", 81);
        
        System.out.println(Equipe);
        System.out.println(Jugador);
        System.out.println(Tecnico);
        System.out.println(Masajista);
    }
}