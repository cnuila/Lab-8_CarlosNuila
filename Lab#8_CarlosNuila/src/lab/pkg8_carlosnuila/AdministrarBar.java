/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8_carlosnuila;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

/**
 *
 * @author Carlos Nuila
 */
public class AdministrarBar extends Thread {

    private Mesa mesa;
    private JProgressBar progressBar;
    private JTextArea textArea;
    private JLabel label;
    private ArrayList<Cliente> clientesCreados;
    private ArrayList<Comida> listaComida;
    private boolean vive;

    public AdministrarBar(Mesa mesa, ArrayList<Cliente> clientesCreados, ArrayList<Comida> listaComida, JTextArea textArea) {
        this.mesa = mesa;
        this.textArea = textArea;
        this.listaComida = listaComida;
        this.clientesCreados = clientesCreados;
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
            mesa.getListaClienteMesa().clear();
            ArrayList<Cliente> clienteMesa = mesa.getListaClienteMesa();
            String estado = "";
            for (int i = 0; i < clientesCreados.size(); i++) {
                clienteMesa.add(clientesCreados.get(i));
                //clientesCreados.remove(i);
                //AdministrarCliente ac1 = new AdministrarCliente("./Clientes.cans");
                //ac1.escribirArchivo();
                if (clienteMesa.size() == 4) {
                    i = clientesCreados.size();
                }
            }
            if (!clienteMesa.isEmpty()) {
                int h = 1;
                textArea.setText("");
                for (Cliente temp : clienteMesa) {
                    textArea.append(h + ") " + temp.getNombre() + "\n");
                    h++;
                }
                if (clienteMesa.size() <= 4) {
                    estado = "Llenando Mesa";
                    label.setText(estado);
                    if (label.getText().equals("Llenando Mesa")) {
                        progressBar.setMaximum(15);
                        progressBar.setValue(progressBar.getValue() + 1);
                        progressBar.setString(Integer.toString(progressBar.getValue()) + " Minutos");
                        if (progressBar.getValue() == 15) {
                            progressBar.setValue(0);
                            progressBar.setString(Integer.toString(progressBar.getValue()) + " Minutos");
                            estado = "Ordenando";
                            label.setText(estado);
                        }
                    }
                    if (label.getText().equals("Ordenando")) {
                        for (int i = 0; i < clienteMesa.size(); i++) {
                            Random r = new Random();
                            int numero = 1 + r.nextInt(11);
                            Comida comidaActual = listaComida.get(numero);
                            Cliente clienteActual = clientesCreados.get(i);
                            double efectivo = clientesCreados.get(i).getDineroEfectivo();
                            double cargo = clientesCreados.get(i).getCargoTarjeta();

                            double efectivoquitar = 0;

                            double Precio1 = comidaActual.getPrecio();

                            if (clienteActual.getUniversidad().equals("UNITEC")) {
                                Precio1 = Precio1 - Precio1 * 0.20;
                            }
                            if (efectivo <= Precio1) {
                                efectivoquitar = efectivo - Precio1;
                                clienteActual.setDineroEfectivo(efectivoquitar);
                            } else {
                                clienteActual.setCargoTarjeta(Precio1);
                            }
                            clienteActual.getCosasOrdenadas().add(comidaActual);
                        }
                        int tiempoMedia = 0;
                        int tiempoMayor = 0;
                        for (int i = 0; i < clienteMesa.size(); i++) {
                            tiempoMedia += clienteMesa.get(i).getCosasOrdenadas().get(0).getTiempo();
                            if (tiempoMayor < clienteMesa.get(i).getCosasOrdenadas().get(0).getTiempo()) {
                                tiempoMayor = clienteMesa.get(i).getCosasOrdenadas().get(0).getTiempo();
                            }
                        }
                        tiempoMedia = tiempoMedia / clienteMesa.size();
                        tiempoMedia = (int) Math.ceil(tiempoMedia);
                        tiempoMayor = (int) Math.ceil(tiempoMayor * 0.25);
                        int tiempoTotal = tiempoMayor + tiempoMedia;
                        progressBar.setMaximum(tiempoTotal);
                        progressBar.setValue(progressBar.getValue() + 1);
                        progressBar.setString(Integer.toString(progressBar.getValue()) + " Minutos");
                        estado = "Comiendo";
                        label.setText(estado);
                    }
                    if (estado.equals("Comiendo")) {
                        int tiempo = 0;
                        if (clienteMesa.size() == 1) {
                            tiempo = 30;
                        }
                        if (clienteMesa.size() == 2) {
                            tiempo = 45;
                        }
                        if (clienteMesa.size() == 3) {
                            tiempo = 60;
                        }
                        if (clienteMesa.size() == 4) {
                            tiempo = 90;
                        }
                        progressBar.setMaximum(tiempo);
                        progressBar.setValue(progressBar.getValue() + 1);
                        progressBar.setString(Integer.toString(progressBar.getValue()) + " Minutos");
                        
                        estado = "Vacio";
                        label.setText(estado);
                    }
                }
            }
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {

            }
        }
    }

    public ArrayList<String> ordenar(Cliente cliente, ArrayList<String> temporal) {

        return temporal;
    }
}
