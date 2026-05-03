/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.bibliotecatrabajogrupal.Objeto;
import java.util.Date;
public class Persona {
    private String nombre;
    private String cedula;
    private Date fechaNac;
    private String apellido;
    
    public Persona(){
        
    }
    
    public Persona(String nombre, String cedula, Date fechaNac, String apellido){
        this.nombre = nombre;
        this.cedula = cedula;
        this.fechaNac = fechaNac;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac= fechaNac;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    @Override
    public String toString(){
        String resultado = "\n";
        resultado += "Nombre del usuario: " + nombre + "\n";
        resultado += "Cedula : " + cedula + "\n";
        resultado += "Fecha de Nacimiento: " + fechaNac;
        resultado += "Apellido: " + apellido;
        return resultado;
    }
    
    public boolean esMayorDeEdad(Date fechaNac){
        Date fechaActual = new Date();
        int edad =fechaActual.getYear()- fechaNac.getYear();
        boolean mayorDeEdad = edad>=18;
        return mayorDeEdad;
    }
            
}
