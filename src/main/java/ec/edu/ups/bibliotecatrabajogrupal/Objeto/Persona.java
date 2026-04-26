/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.bibliotecatrabajogrupal.Objeto;
public class Persona {
    private String nombre;
    private String cedula;
    private int edad;
    private String apellido;
    
    public Persona(){
        
    }
    
    public Persona(String nombre, String cedula, int edad, String apellido){
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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
        resultado += "Edad: " + edad;
        resultado += "Apellido: " + apellido;
        return resultado;
    }
            
}
