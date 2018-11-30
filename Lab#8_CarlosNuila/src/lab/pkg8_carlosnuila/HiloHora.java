/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8_carlosnuila;

import javax.swing.JLabel;

/**
 *
 * @author Carlos Nuila
 */
public class HiloHora extends Thread {

    private JLabel hora;
    private int estado = 0;

    public HiloHora(JLabel hora) {
        this.hora = hora;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public void run() {
        boolean tiempo = true;
        int minutos = 0;
        int horas = 12;
        while (tiempo) {
            if (minutos < 60) {
                minutos++;
                if (minutos < 10) {
                    hora.setText(horas + ":0" + minutos);
                } else {
                    hora.setText(horas + ":" + minutos);
                }
            } else {
                minutos = 0;
                horas++;
                if (horas == 24) {
                    horas = 0;
                }
                if (horas == 4){
                    tiempo = false;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
        }
    }

}
