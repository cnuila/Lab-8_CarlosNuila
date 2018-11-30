/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8_carlosnuila;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author Carlos Nuila
 */
public class Mesa {
    
    private JLabel estado;
    private JProgressBar progressBarmesa;
    private ArrayList<Cliente> listaClienteMesa = new ArrayList();

    public Mesa() {
    }

    public Mesa(JLabel estado, JProgressBar progressBarmesa) {
        this.estado = estado;
        this.progressBarmesa = progressBarmesa;
    }

    public ArrayList<Cliente> getListaClienteMesa() {
        return listaClienteMesa;
    }

    public void setListaClienteMesa(ArrayList<Cliente> listaClienteMesa) {
        this.listaClienteMesa = listaClienteMesa;
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
