/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ESTUDIANTES
 */
public class Entrenador extends Equipo {
    private String idFederacion;

    public Entrenador() {
    }

    public Entrenador(String idFederacion, int id, String Nombre, String Apellidos, int Edad) {
        super(id, Nombre, Apellidos, Edad);
        this.idFederacion = idFederacion;
    }

    /**
     * @return the idFederacion
     */
    public String getIdFederacion() {
        return idFederacion;
    }

    /**
     * @param idFederacion the idFederacion to set
     */
    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    
        @Override
    public String toString() {
        return "Entrenador: " + "Id= " + this.getId() + ", Nombre= " + this.getNombre()+ ", Apellidos= " + this.getApellidos() + ", Edad= " + this.getEdad() + ", Id de Federacion= " + idFederacion;
    }
}