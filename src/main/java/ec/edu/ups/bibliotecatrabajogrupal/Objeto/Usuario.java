package ec.edu.ups.bibliotecatrabajogrupal.Objeto;
public class Usuario {
    private String correo;
    private String contrasenia;
    private boolean estadoMembresia;
    private Persona datosUsuario;
    private boolean restriccionesUsuario;

    public Usuario(){
    }

    public Usuario(String correo, String contrasenia, boolean estadoMembresia, Persona datosUsuario, boolean restriccionesUsuario) {
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.estadoMembresia = estadoMembresia;
        this.datosUsuario = datosUsuario;
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

    public Persona getDatosUsuario() {
        return datosUsuario;
    }

    public void setDatosUsuario(Persona datosUsuario) {
        this.datosUsuario = datosUsuario;
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
        resultado += "Datos Usuario: " + datosUsuario;
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
