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
import javax.enterprise.context.Dependent;

/**
 *
 * @author mpozo
 */
@Named(value = "administradorSolicitudes")
@Dependent
public class AdministradorSolicitudes extends Solicitud {

    /**
     * Creates a new instance of AdministradorSolicitudes
     */
    public AdministradorSolicitudes() {
       
    }
   
    
}
