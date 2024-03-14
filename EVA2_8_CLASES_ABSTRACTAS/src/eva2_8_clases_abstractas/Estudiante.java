/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_8_clases_abstractas;

/**
 *
 * @author invitado
 */
public class Estudiante extends Persona {
    private String noControl;
    
    
    
    public Estudiante() {
        super();
        this.noControl = "__________";
    }
    
    
    public Estudiante(String noControl,String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.noControl = noControl;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    // Al ser protected, podemos ver los atributos de Persona
    //por estar vinculados por herencia
    //Tambien hey visibilidad del paquete: clases en el mismo paquete pueden ver 
    //
    public void imprimirDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellidos: "+apellidos);
        System.out.println("Edad: "+edad);
        System.out.println("No de control: "+noControl);
    }
    
    
  
    
}
