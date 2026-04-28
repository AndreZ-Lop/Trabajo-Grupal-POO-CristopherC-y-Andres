package ec.edu.ups.bibliotecatrabajogrupal.Objeto;
public class Libreria {
    private Libro nuevoLibro;
    private Autor autorLibro; 
    private boolean estado;

    public Libreria() {
        
    }
    
    public Libreria(boolean estado){
        this.estado=estado;
    }

    public Libreria(Libro nuevoLibro, Autor autorLibro) {
        this.nuevoLibro = nuevoLibro;
        this.autorLibro = autorLibro;
    }

    public Libro getNuevoLibro() {
        return nuevoLibro;
    }

    public void setNuevoLibro(Libro nuevoLibro) {
        this.nuevoLibro = nuevoLibro;
    }

    public Autor getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(Autor autorLibro) {
        this.autorLibro = autorLibro;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    @Override
     public String toString(){
        String resultado = "\n";
        resultado += "--- DATOS LIBRO --- " + "\n";
        resultado += nuevoLibro + "\n";
        resultado += "--- AUTOR --- " + "\n";
        resultado += autorLibro + "\n";
        if (estado){
            resultado += "Disponible";
        }else{
            resultado += "No Disponible";
        }
        return resultado;
    }
     
    public String prestamoLibro(Usuario solicitante,Libreria libroSolicitado){
         if(solicitante.getEstadoMembresia() && libroSolicitado.estado){
             solicitante.setEstadoMembresia(false);
             libroSolicitado.setEstado(false);
             return "El préstamo se realizó con éxito a: " + solicitante.getDatosUsuario().getNombre();
         }else if(!solicitante.getEstadoMembresia()){
             return "Error: El usuario ya tiene un libro en su poder.";
         }else{
             return "Error: El libro solicitado no está disponible actualmente.";
         }
    }
    
    public String devolucionLibro(Usuario solicitante,Libreria libroSolicitado){
         if(!solicitante.getEstadoMembresia() && !libroSolicitado.estado){
             solicitante.setEstadoMembresia(true);
             libroSolicitado.setEstado(true);
             return "La devolucion se realizó con éxito el usuario: " + solicitante.getDatosUsuario().getNombre() + " NO DEBE TIENE DEUDAS";
         }else if(solicitante.getEstadoMembresia()){
             return "Error: El usuario no debe devolver ningun libro.";
         }else{
             return "Error: El libro solicitado no debe ser devuelto por el usuario." + solicitante.getDatosUsuario().getNombre();
         }
    }
       
}
