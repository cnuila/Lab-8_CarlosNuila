/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8_carlosnuila;

import java.io.Serializable;

/**
 *
 * @author Carlos Nuila
 */
public class Comida implements Serializable {
    
    private String nombre;
    private int tiempo;
    private int precio;
    private int cantidad;
    
    private static final long SerialVersionUID = 1008L;

    public Comida() {
    }

    public Comida(String nombre, int tiempo, int precio, int cantidad) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}
