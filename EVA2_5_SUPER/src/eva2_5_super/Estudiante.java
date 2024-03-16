/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_5_super;

/**
 *
 * @author invitado
 */


//          HIJA        DE      PERSONA
//          SUBCLASE    DE      SUPERCLASE
public class Estudiante extends Persona{
    private String noControl;
    private String carrera;

    
    public Estudiante(){
    
    super();//LLAMADA DE LA SUPERCLASE
    noControl= "------";
    carrera = "-------";
    }
    //Regla de herencia: Siempre hay que llamar al constructor de la SUPERCLASE.
    //Siempre tiene que ser la primer instrucción del constructor.
    public Estudiante(String nombre, String apPaterno, String apMaterno, int edad, char genero,String noControl,String carrera){
        super(nombre,apPaterno,apMaterno,edad,genero);
        this.noControl = noControl;
        this.carrera = carrera;
        
    }
    
    
    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
 
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("NoControl: "+noControl);
        System.out.println("Carrera: "+carrera);
    }
    
    
}
