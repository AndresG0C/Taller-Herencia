/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ESTUDIANTES
 */
public class Masajista extends Equipo{
    private String Titulacion;
    private int AñosExperiencia;

    public Masajista() {
    }

    public Masajista(String Titulacion, int AñosExperiencia, int id, String Nombre, String Apellidos, int Edad) {
        super(id, Nombre, Apellidos, Edad);
        this.Titulacion = Titulacion;
        this.AñosExperiencia = AñosExperiencia;
    }

    
    

    /**
     * @return the Titulacion
     */
    public String getTitulacion() {
        return Titulacion;
    }

    /**
     * @param Titulacion the Titulacion to set
     */
    public void setTitulacion(String Titulacion) {
        this.Titulacion = Titulacion;
    }

    /**
     * @return the AñosExperiencia
     */
    public int getAñosExperiencia() {
        return AñosExperiencia;
    }

    /**
     * @param AñosExperiencia the AñosExperiencia to set
     */
    public void setAñosExperiencia(int AñosExperiencia) {
        this.AñosExperiencia = AñosExperiencia;
    }
    
        @Override
    public String toString() {
        return "Masajista: " + "Id= " + this.getId() + ", Nombre= " + this.getNombre()+ ", Apellidos= " + this.getApellidos() + ", Edad= " + this.getEdad() + ", Titulacion= " + Titulacion + ", Años de Experiencia= " + AñosExperiencia;
    }
    
}
