/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_6_clases_abstractas;

/**
 *
 * @author Yahir
 */
public class Circulo extends Figura {
    private double radio;

    public Circulo() {
        this.radio = 0.0;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcular_area(){
        return Math.PI * (Math.pow(radio,2));
    }
     
    @Override
    public double calcular_perimetro() {
        return (radio*2)*Math.PI;
    }
    
    
}
