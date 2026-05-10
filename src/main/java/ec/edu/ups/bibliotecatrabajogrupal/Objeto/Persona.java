/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.bibliotecatrabajogrupal.Objeto;
import java.util.Date;
public class Persona {
    private String nombreCompleto;
    private String cedula;
    private Date fechaNac;
    
    public Persona(){
        
    }

    public Persona(String nombreCompleto, String cedula, Date fechaNac) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.fechaNac = fechaNac;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
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
        this.fechaNac = fechaNac;
    }
    
    
    
    
    
    @Override
    public String toString(){
        String resultado = "\n";
        resultado += "Nombre Completo: " + "[" + nombreCompleto + "]" + "\n";
        resultado += "Cedula : " + cedula + "\n";
        resultado += "Fecha de Nacimiento: " + fechaNac;
        return resultado;
    }
    
    public boolean esMayorDeEdad(Date fechaNac){
        Date fechaActual = new Date();
        int edad =fechaActual.getYear()- fechaNac.getYear();
        boolean mayorDeEdad = edad>=18;
        return mayorDeEdad;
    }
            
}
