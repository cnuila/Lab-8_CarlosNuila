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
public class AdministrarBar extends Thread {

    private Mesa mesa;
    private JProgressBar progressBar;
    private JLabel label;
    private ArrayList<Cliente> clientesCreado;
    private boolean vive;

    public AdministrarBar(Mesa mesa, ArrayList<Cliente> clientesCreado) {
        this.mesa = mesa;
        this.clientesCreado = clientesCreado;
        this.vive = true;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        progressBar = mesa.getProgressBarmesa();
        label = mesa.getEstado();
        while (vive) {
            ArrayList<Cliente> clienteMesa = mesa.getListaClienteMesa();
            String estado = "";
            for (int i = 0; i < clientesCreado.size(); i++) {
                
                clienteMesa.add(clientesCreado.get(i));
                clientesCreado.remove(i);
                if (clienteMesa.size() == 4) {
                    i = clientesCreado.size();
                }
            }

            progressBar.setMaximum(15);
            System.out.println(progressBar.getValue());
            progressBar.setValue(progressBar.getValue() + 1);
            progressBar.setString(Integer.toString(progressBar.getValue()) + " Minutos");
            if (progressBar.getValue() == 15){
                progressBar.setValue(0);
                progressBar.setString(Integer.toString(progressBar.getValue()) + " Minutos");
            }
            
            
            
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {

            }
        }
    }

}
