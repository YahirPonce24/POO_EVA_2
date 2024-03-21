/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_11_has_a;

/**
 *
 * @author invitado
 */
public class Persona {
    private String Nombre;
    private String Apellidos;
    private int Edad;
    private Direccion direccion;//Persona has a Direccion, Direccion es un componente de persona

    public Persona() {
        this.Nombre = "";
        this.Apellidos = "";
        this.Edad = 0;
        this.direccion = new Direccion();
    }

    public Persona(String Nombre, String Apellidos, int Edad, Direccion direccion) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Edad = Edad;
        this.direccion = direccion;
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

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString(){
        String cade = "Nombre." + Nombre + "\n" + 
                      "Apellido: "+ Apellidos +"\n" +
                      "Edad: "+ Edad +"\n" +
                      "Direccion: "+ Direccion ;
        return cade;
    }
   
    
}
