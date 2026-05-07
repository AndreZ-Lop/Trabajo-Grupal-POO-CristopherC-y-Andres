/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.bibliotecatrabajogrupal.Objeto;
import java.util.Date;
/**
 *
 * @author LAB_04
 */
public class Empleado extends Persona {
    private String cargo;
    public Empleado(){
        
    }
    public Empleado(String nombre,String cedula, Date fechaNac,String apellido,String cargo){
        super(nombre,cedula,fechaNac, apellido);
        this.cargo=cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        String resultado = super.toString();
        resultado += ", cargo=" + cargo;
        return resultado;
    }
    
    
}
