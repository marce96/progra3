
package dao;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author mpozo
 */
@Named(value = "personaBean")
@RequestScoped
public class PersonaBean {

    private String saludo, nombre, apellidos;
    private int edad, tickets;
    private String correo;
    private String tipo;
    /**
     * Creates a new instance of PersonaBean
     */
    public PersonaBean() {
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
}
