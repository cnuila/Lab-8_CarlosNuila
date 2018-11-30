/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8_carlosnuila;

import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author Carlos Nuila
 */
public class Mesa {
    
    private int cantidadenMesa;
    private JLabel estado;
    private JProgressBar progressBarmesa;

    public Mesa() {
    }

    public Mesa(int cantidadenMesa, JLabel estado, JProgressBar progressBarmesa) {
        this.cantidadenMesa = cantidadenMesa;
        this.estado = estado;
        this.progressBarmesa = progressBarmesa;
    }

    public int getCantidadenMesa() {
        return cantidadenMesa;
    }

    public void setCantidadenMesa(int cantidadenMesa) {
        this.cantidadenMesa = cantidadenMesa;
    }

    public JLabel getEstado() {
        return estado;
    }

    public void setEstado(JLabel estado) {
        this.estado = estado;
    }

    

    public JProgressBar getProgressBarmesa() {
        return progressBarmesa;
    }

    public void setProgressBarmesa(JProgressBar progressBarmesa) {
        this.progressBarmesa = progressBarmesa;
    }
    
    
    
}
