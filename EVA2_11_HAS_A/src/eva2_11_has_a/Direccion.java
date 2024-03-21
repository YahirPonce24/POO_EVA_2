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
public class Direccion {
    private String calle;
    private String colonia;
    private int codigo_postal;
    private String numero_calle;

    public Direccion() {
        this.calle = "________";
        this.colonia = "______";
        this.codigo_postal = 0000;
        this.numero_calle = "A-0";
    }

    public Direccion(String calle, String colonia, int codigo_postal, String numero_calle) {
        this.calle = calle;
        this.colonia = colonia;
        this.codigo_postal = codigo_postal;
        this.numero_calle = numero_calle;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public int getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(int codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getNumero_calle() {
        return numero_calle;
    }

    public void setNumero_calle(String numero_calle) {
        this.numero_calle = numero_calle;
    }
    @Override
    public String toString(){
        String cade = "Calle: " +calle+ " Colonia:"+colonia+" CP: " +codigo_postal+" #"+numero_calle;
        return cade;
    }
    
}
