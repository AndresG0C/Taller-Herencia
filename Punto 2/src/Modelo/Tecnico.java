/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author andre
 */
public class Tecnico extends Operario {

    public Tecnico() {
    }

    public Tecnico(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Empleado " + this.getNombre() + " -> Operario -> Tecnico";
    }
    
}
