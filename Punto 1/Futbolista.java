/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ESTUDIANTES
 */
public class Futbolista extends Equipo{
    private int Dorsal;
    private String Demarcacion;

    public Futbolista() {
    }

    public Futbolista(int id, String Nombre, String Apellidos, int Edad, int Dorsal, String Demarcacion) {
        super(id, Nombre, Apellidos, Edad);
        this.Dorsal = Dorsal;
        this.Demarcacion = Demarcacion;
    }

    /**
     * @return the Dorsal
     */
    public int getDorsal() {
        return Dorsal;
    }

    /**
     * @param Dorsal the Dorsal to set
     */
    public void setDorsal(int Dorsal) {
        this.Dorsal = Dorsal;
    }

    /**
     * @return the Demarcacion
     */
    public String getDemarcacion() {
        return Demarcacion;
    }

    /**
     * @param Demarcacion the Demarcacion to set
     */
    public void setDemarcacion(String Demarcacion) {
        this.Demarcacion = Demarcacion;
    }

    @Override
    public String toString() {
        return "Futbolista: " + "Id= " + this.getId() + ", Nombre= " + this.getNombre()+ ", Apellidos= " + this.getApellidos() + ", Edad= " + this.getEdad() + ", Dorsal=" + Dorsal + ", Demarcacion=" + Demarcacion;
    }
}