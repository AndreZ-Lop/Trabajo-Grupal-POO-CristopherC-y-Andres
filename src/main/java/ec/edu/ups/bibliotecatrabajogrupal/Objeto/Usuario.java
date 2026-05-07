package ec.edu.ups.bibliotecatrabajogrupal.Objeto;

import java.util.Date;

public class Usuario extends Persona{
    private String correo;
    private String contrasenia;
    private boolean estadoMembresia;
    private boolean restriccionesUsuario;

    public Usuario() {
    }

    public Usuario(String correo, String contrasenia, boolean estadoMembresia, boolean restriccionesUsuario, String nombre, String cedula, Date fechaNac, String apellido) {
        super(nombre, cedula, fechaNac, apellido);
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.estadoMembresia = estadoMembresia;
        this.restriccionesUsuario = restriccionesUsuario;
    }
    
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public boolean getEstadoMembresia() {
        return estadoMembresia;
    }

    public void setEstadoMembresia(boolean estadoMembresia) {
        this.estadoMembresia = estadoMembresia;
    }
    
    public boolean getRestricionesUsuario(){
        return restriccionesUsuario;
    }
    
    public void setRestriccionesUsuario(boolean restriccionesUsuario){
        this.restriccionesUsuario = restriccionesUsuario;
    }
    
    @Override
    public String toString(){
        String resultado = "";
        resultado += "Correo: " + correo + "\n";
        resultado += "Contraseña: " + contrasenia + "\n";
        if (estadoMembresia){
            resultado += "Puede solicitar un libro" + "\n";
        }else{
            resultado += "No puede solicitar un libro" + "\n";
        }
        resultado += "Datos Usuario: " + "\n";
        resultado+= super.toString() + "\n";
        if(restriccionesUsuario){
            resultado += "Esta cuenta tiene restricciones";
        }else{
            resultado += "Esta cuenta no tiene restricciones";
        }
        return resultado;
    } 
    
    public String restriccionesUsuario(boolean res,Usuario restriccionesUsuario){
        if (!res){
            restriccionesUsuario.setRestriccionesUsuario(true);
            return "Su cuenta tendra restricciones por lo que no podra pedir algunos libros";
        }else{
            return "";
        }
    }
        
}
