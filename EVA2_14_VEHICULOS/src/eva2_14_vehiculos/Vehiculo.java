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
public abstract class Vehiculo {

    private int velocidad;

    public Vehiculo() {

        this.velocidad = 0;
    }

    public Vehiculo(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void acelerar(int ajuste) {
        velocidad += ajuste;
    }
}
