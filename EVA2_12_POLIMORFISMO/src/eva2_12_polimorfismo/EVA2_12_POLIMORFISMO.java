/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_12_polimorfismo;

/**
 *
 * @author invitado
 */
public class EVA2_12_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estudiante = new Estudiante("0333551", "Antonio", "Macias");
        System.out.println(estudiante);
        //Podemos convertir un objeto de una subclase a uno de una super clase
        Persona persona = estudiante;
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellidos: " + persona.getApellidos());
        //
        Persona perso = new Persona("Pedro", "Parquin");
        System.out.println(perso);
//        Estudiante estu = perso; no se puede convertir una super clase a una sub clase porque la subclase tiene variantes que no tiene la superclase
        
        
        
    }

}

class Persona {

    private String nombre;
    private String apellidos;

    public Persona() {
        this.nombre = "";
        this.apellidos = "";
    }

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {

        return nombre + " " + apellidos;

    }

}

class Estudiante extends Persona {

    private String noControl;

    public Estudiante() {
        super();
        this.noControl = "";
    }

    /*public Estudiante(String noControl) {
     this.noControl = noControl;
     }*/
    public Estudiante(String noControl, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.noControl = noControl;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    @Override
    public String toString() {
        return super.toString() + " " + noControl;
    }

}
