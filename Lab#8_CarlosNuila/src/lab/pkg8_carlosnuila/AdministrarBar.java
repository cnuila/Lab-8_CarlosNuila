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
public class AdministrarBar extends Thread {
    
    Mesa mesa;
    JProgressBar progressBar = mesa.getProgressBarmesa();
    JLabel label = mesa.getEstado();
    private boolean vive;

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    
    @Override
    public void run(){
        while (vive){
            
        }
    }
    
    
}
