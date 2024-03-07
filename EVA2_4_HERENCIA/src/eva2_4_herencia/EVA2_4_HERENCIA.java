/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_4_herencia;

/**
 *
 * @author invitado
 */
public class EVA2_4_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso1 = new Persona();
        System.out.println(perso1.toString());
        Estudiante estu1 = new Estudiante();
        System.out.println("Nombre: "+estu1.getNombre());
        System.out.println("Apellidos: "+estu1.getApellidos());
        System.out.println("Edad: "+estu1.getEdad());

        // TODAS LAS CLASES EN JAVA DESCIENDEN DE LA CLASE Objet
    
    }
    
}
class Persona {
private String Nombre;
private String Apellidos;
private int Edad;

    public Persona() {
        this.Nombre = "SIN NOMBRE";
        this.Apellidos = "SIN APELLIDOS";
        this.Edad = 0;
    }

    public Persona(String Nombre, String Apellidos, int Edad) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

}


class Estudiante extends Persona{
    private String noControl;

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    

}
