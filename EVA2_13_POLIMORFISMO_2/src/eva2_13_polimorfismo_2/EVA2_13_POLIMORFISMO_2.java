/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_13_polimorfismo_2;

/**
 *
 * @author invitado
 */
public class EVA2_13_POLIMORFISMO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*  Persona perso1 = new Persona ("Michelle", "Lopez");
        Persona perso2 = new Persona ("Carolina", "Rocha");
        Persona perso3 = new Persona ("Martin", "Lopez");
        Estudiante estu1 = new Estudiante("Luez", "Maria", "235512");
        Estudiante estu2 = new Estudiante("Miguel", "Torres", "5445451");
        Estudiante estu3 = new Estudiante("Yahir", "Ponce", "456478");
        
        imprimirDatos(estu3);
        imprimirDatos(estu2);
        imprimirDatos(estu1);
        imprimirDatos(perso1);
        imprimirDatos(perso2);
        imprimirDatos(perso3);
        */
        Estudiante estudiantes[] = new Estudiante[3000];
        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i] = new Estudiante("0000", "Estudiante", "Sin datos");
        }
        for (int i = 0; i < estudiantes.length; i++) {
            imprimirDatos(estudiantes[i]);
        }
    }
    public static void imprimirDatos (MostrarDatos datos){
    datos.imprimirDatos();
    //CASTING
    Estudiante estu;
    Persona perso;

    if(datos instanceof  Estudiante){
    estu = (Estudiante)datos;
    }else{
    perso = (Persona)datos;
    }
    
    
    
    }
}
