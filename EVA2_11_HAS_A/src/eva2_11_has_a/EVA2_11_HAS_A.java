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
public class EVA2_11_HAS_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here(
        Direccion direc = new Direccion ("Mina Real", "Riberas", 33310, "125-A");
        Persona p1 = new Persona ("Alma Marcela", "Goso", 69, direc);
        System.out.println(p1);
    }
    
}
