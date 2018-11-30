/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8_carlosnuila;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Carlos Nuila
 */
public class Cliente implements Serializable {
    
    private String nombre;
    private String apellido;
    private String tarjetaCredito;
    private double cargoTarjeta;
    private double dineroEfectivo;
    private ArrayList<String> cosasOrdenadas = new ArrayList();
    private String universidad;
    private int numeroCuenta;
    
    private static final long SerialVersionUID = 1008;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String tarjetaCredito, double cargoTarjeta, double dineroEfectivo, String universidad, int numeroCuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tarjetaCredito = tarjetaCredito;
        this.cargoTarjeta = cargoTarjeta;
        this.dineroEfectivo = dineroEfectivo;
        this.universidad = universidad;
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public double getCargoTarjeta() {
        return cargoTarjeta;
    }

    public void setCargoTarjeta(double cargoTarjeta) {
        this.cargoTarjeta = cargoTarjeta;
    }

    public double getDineroEfectivo() {
        return dineroEfectivo;
    }

    public void setDineroEfectivo(double dineroEfectivo) {
        this.dineroEfectivo = dineroEfectivo;
    }

    public ArrayList<String> getCosasOrdenadas() {
        return cosasOrdenadas;
    }

    public void setCosasOrdenadas(ArrayList<String> cosasOrdenadas) {
        this.cosasOrdenadas = cosasOrdenadas;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
    
    
    
}
