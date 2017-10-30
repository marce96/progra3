/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import datos.Solicitud;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author mpozo
 */
@Named(value = "datos")
@RequestScoped
public class datos extends Solicitud{

    /**
     * Creates a new instance of datos
     */
    public datos() {
    }
        
    public List guardar(Solicitud solicitud){
        List lista = new ArrayList();
        lista.add(solicitud.getId());
        lista.add(solicitud.getCliente());
        lista.add(solicitud.getDetalle());
        lista.add(solicitud.getFecha());
        return lista;
        }
    
}
