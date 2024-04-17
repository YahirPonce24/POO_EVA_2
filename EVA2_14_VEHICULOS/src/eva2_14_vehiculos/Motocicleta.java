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
public class Motocicleta extends Vehiculo{
    private int capacidad;

    public Motocicleta() {
    }

    public Motocicleta(int capacidad, int velocidad) {
        super(velocidad);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
    
    
}
