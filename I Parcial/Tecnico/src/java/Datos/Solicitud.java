/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author mpozo
 */
public class Solicitud {
 String cliente, detalles, fecha;

    public Solicitud(String cliente, String detalles, String fecha) {
        this.cliente = cliente;
        this.detalles = detalles;
        this.fecha = fecha;
    }

    public Solicitud() {
    }
    

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "-> NUEVA SOLICITUD: \nCliente: " + cliente + ", Detalles: " + detalles + ", Fecha: " + fecha + "\n \n \n";
    }
    
    
}
