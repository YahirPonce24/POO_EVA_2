/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_14_vehiculos;

/**
 *
 * @author invitado
 */
public class EVA2_14_VEHICULOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Vehiculo flota[] = new Vehiculo[10];
        
        /*Se pueden almacenar todas los objetos de nuestras clases como objetos de la clase base*/
        
        flota[0] = new Automovil(4, 0);
        flota[1] = new Automovil(2, 0);
        flota[2] = new Automovil(6, 0);
        flota[3] = new Automovil(4, 0);
        flota[4] = new Automovil(4, 0);
        flota[5] = new Motocicleta(125, 0);
        flota[6] = new Motocicleta(150, 0);
        flota[7] = new Motocicleta(1000, 0);
        flota[8] = new Motocicleta(200, 0);
        flota[9] = new Motocicleta(1000, 0);
    
        /**/
        
        Automovil auto = (Automovil) flota[0];
        System.out.println("Numero de puertas: "+auto.getNoPuertas());
        Motocicleta moto = (Motocicleta) flota[5];
        System.out.println("Capacidad (CC): "+moto.getCapacidad());
    
        /*Si no sabemos que tipo esta almacenado, usamos instanceof*/
        if(flota[1] instanceof Automovil){
            auto = (Automovil) flota[1];
            System.out.println("Numero de puestas: "+auto.getNoPuertas());
            
        }
        
        //
        acelerar(auto, 50);
        System.out.println("Velocidad auto: "+auto.getVelocidad());
        acelerar(moto, 100);
        System.out.println("Velocidad moto: "+moto.getVelocidad());
        acelerar(flota[3], 1000);
        System.out.println("Velocidad auto: "+flota[3].getVelocidad());
        acelerar(flota[3], -70);
        System.out.println("Velocidad auto: "+flota[3].getVelocidad());
    }

        public static void acelerar (Vehiculo vehiculo, int ajuste){
             vehiculo.acelerar(ajuste);
        }
}
