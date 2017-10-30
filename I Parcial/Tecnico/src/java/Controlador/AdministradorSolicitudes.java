/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author mpozo
 */
@Named(value = "administradorSolicitudes")
@SessionScoped
public class AdministradorSolicitudes implements Serializable {
   String client, detail, date;
   ArrayList<DatosSolicitud> array = new ArrayList<DatosSolicitud>();


    public void setAgregar(String a, String b, String c){ 
           DatosSolicitud obj;
           obj = new DatosSolicitud();
           obj.setCliente(a);
           obj.setDetalles(b);
           obj.setFecha(c);
           array.add(obj);
    }
    
    public ArrayList<DatosSolicitud> getLista(){
    return array;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
    public String getMostrar(){ 
        String dato =" ";
        for (int i = 0; i < array.size(); i++) {
          DatosSolicitud obj = (DatosSolicitud)array.get(i);
          dato += array.get(i).toString();
         }
       return dato;
    }
    
    public String getFecha(){
    Calendar fecha = Calendar.getInstance();
    fecha.add(Calendar.DATE, 1);
    SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
    
    
    return format1.format(fecha.getTime());  
    }

}