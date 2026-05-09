package ec.edu.ups.bibliotecatrabajogrupal.Objeto;

import java.util.Date;

public class Usuario extends Persona{
    private String correo;
    private String contrasenia;
    private boolean restriccionesUsuario;
    private Membresia membresiaU;

    public Usuario() {
    }

    public Usuario(String correo, String contrasenia, boolean restriccionesUsuario, String nombre, String cedula, Date fechaNac, String apellido) {
        super(nombre, cedula, fechaNac, apellido);
        this.correo = correo;
        this.contrasenia = contrasenia;
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
    
    public boolean getRestricionesUsuario(){
        return restriccionesUsuario;
    }
    
    public void setRestriccionesUsuario(boolean restriccionesUsuario){
        this.restriccionesUsuario = restriccionesUsuario;
    }
    
    public void agregarMembresia(String tipoMembresia, boolean estado, String codigoDeMembresia){
        Membresia membresiaUsuario = new Membresia(tipoMembresia, estado, codigoDeMembresia);
        this.membresiaU=membresiaUsuario;
    }
    
    public Membresia getMembresiaU(){
        return membresiaU;
    }
    
    @Override
    public String toString(){
        String resultado = "";
        resultado += "Correo: " + correo + "\n";
        resultado += "Contraseña: " + contrasenia + "\n";
        resultado += "Datos Usuario: " + "\n";
        resultado+= super.toString() + "\n";
        if(restriccionesUsuario){
            resultado += "Esta cuenta tiene restricciones" + "\n";
        }else{
            resultado += "Esta cuenta no tiene restricciones" + "\n";
        }
        resultado+= membresiaU + "\n";
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
    
    public void cambioEstadoMemebresia(boolean cambio){
        this.membresiaU.setEstado(cambio);
    }
        
}
