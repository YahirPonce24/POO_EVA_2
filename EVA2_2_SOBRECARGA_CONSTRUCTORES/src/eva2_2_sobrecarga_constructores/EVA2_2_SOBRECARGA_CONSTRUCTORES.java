/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_2_sobrecarga_constructores;

/**
 *
 * @author invitado
 */
public class EVA2_2_SOBRECARGA_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona perso1= new Persona();
        perso1.imprimirDatos();
        
        Persona perso2 = new Persona("Pedro", "Paramo", 20);
        perso2.imprimirDatos();
        perso2.setNombre("JUAN");
        perso2.setApellidos("RULFO");
        perso2.setEdad(32);
        perso2.imprimirDatos();
        
        
        
        
    }
    
}
