/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Datos.Solicitud;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author mpozo
 */
@Named(value = "datosSolicitud")
@RequestScoped
public class DatosSolicitud extends Solicitud{
    /**
     * Creates a new instance of DatosSolicitud
     */

    public void transferir() {
        FacesContext context = FacesContext.getCurrentInstance();
        AdministradorSolicitudes as = context.getApplication().evaluateExpressionGet(context, "#{administradorSolicitudes}", AdministradorSolicitudes.class);
        as.setClient(getCliente());
        as.setDetail(getDetalles());
        as.setDate(getFecha());
        as.setAgregar(getCliente(), getDetalles(), getFecha());
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    
}
