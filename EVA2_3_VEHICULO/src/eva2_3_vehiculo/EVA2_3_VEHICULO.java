/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_3_vehiculo;

/**
 *
 * @author invitado
 */
public class EVA2_3_VEHICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vehiculo carro1= new Vehiculo (); 
        carro1.imprimir_datos();
        Vehiculo carro2 = new Vehiculo ("Audi","Rampage",1985,"morado");
        carro2.imprimir_datos();
        carro2.setMarca("Ford");
        carro2.setModelo("Mustang");
        carro2.setAnnio(1975);
        carro2.setColor("amarillo");
        carro2.imprimir_datos();
        
    }
    
}
