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
public class Vehiculo {
    private String marca = "Sin marca";
    private String modelo = "Sin modelo";
    private int annio = 0;
    private String color = "Sin color";

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int annio, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.annio = annio;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void imprimir_datos(){
        System.out.println("_________________________________________");
        System.out.println("LA MARCA DEL VEHICULO ES: "+marca);
        System.out.println("EL MODELO DEL VEHICULO ES: "+modelo);
        System.out.println("EL AÑO DEL VEHICULO ES: "+annio);
        System.out.println("EL COLOR DEL VEHICULO ES: "+color);
    }
    
}
