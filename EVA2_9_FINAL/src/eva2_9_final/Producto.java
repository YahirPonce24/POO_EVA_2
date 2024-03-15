/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_9_final;

/**
 *
 * @author invitado
 */
public abstract class  Producto {
    private String nombre;
    private double precio;

    public Producto() {
        this.nombre = "__________";
        this.precio = 0;
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void escribirproducto(){
    }
    
    @Override
    public String toString(){
        String cade;
        cade ="Nombre: "+ nombre + "\n" + "Precio: " + precio;
        return cade;
    }
    
}
