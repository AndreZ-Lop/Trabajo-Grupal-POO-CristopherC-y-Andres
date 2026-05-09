
package ec.edu.ups.bibliotecatrabajogrupal.Objeto;
import java.util.Date;
public class Prestamo {
    private Date inicioPrestamo;
    private Date finPrestamo;
    private Usuario usuarioPrestado;
    private Libro libroPrestado;
    
    public Prestamo(){
        
    }
    
    public Prestamo(Date fechaInc, Date fechaFin, Usuario usuarioPrestado, Libro libroPrestado){
        this.inicioPrestamo = fechaInc;
        this.finPrestamo = fechaFin;
        this.usuarioPrestado = usuarioPrestado;
        this.libroPrestado = libroPrestado;
    }

    public Date getInicioPrestamo() {
        return inicioPrestamo;
    }

    public void setInicioPrestamo(Date inicioPrestamo) {
        this.inicioPrestamo = inicioPrestamo;
    }

    public Date getFinPrestamo() {
        return finPrestamo;
    }

    public void setFinPrestamo(Date finPrestamo) {
        this.finPrestamo = finPrestamo;
    }

    public Usuario getUsuarioPrestado() {
        return usuarioPrestado;
    }

    public void setUsuarioPrestado(Usuario usuarioPrestado) {
        this.usuarioPrestado = usuarioPrestado;
    }

    public Libro getLibroPrestado() {
        return libroPrestado;
    }

    public void setLibroPrestado(Libro libroPrestado) {
        this.libroPrestado = libroPrestado;
    }
    
    @Override
    public String toString(){
        String resultado ="";
        resultado+="""
                   === DATOS RECIBO ===
                   """;
        resultado+="Inicio prestamo: " + inicioPrestamo + "\n";
        resultado+="Fin prestamo: " + finPrestamo + "\n";
        resultado+="Prestado a: " + usuarioPrestado.getNombre()+ usuarioPrestado.getApellido() + "\n";
        resultado+="Libro prestado: " + libroPrestado.getTitulo() + "\n";
        resultado+="RECUERDA!! el libro debe ser devuelto en una semana";
        return resultado;
    }
    public String prestamoLibro(Usuario solicitante,Libro libroSolicitado){
         if(solicitante.getMembresiaU().getEstado() && libroSolicitado.getEstado()){
             solicitante.cambioEstadoMemebresia(false);
             libroSolicitado.setEstado(false);
             return "El prestamo se realizo con exito a: " + solicitante.getNombre() + " " + solicitante.getApellido();
         }else if(!solicitante.getMembresiaU().getEstado()){
             return "Error: El usuario ya tiene un libro en su poder.";
         }else{
             return "Error: El libro solicitado no esta disponible actualmente.";
         }
    }
    
    public String devolucionLibro(Usuario solicitante,Libro libroSolicitado){
         if(!solicitante.getMembresiaU().getEstado() && !libroSolicitado.getEstado()){
             solicitante.cambioEstadoMemebresia(true);
             libroSolicitado.setEstado(true);
             return "La devolucion se realizo con exito el usuario: " + solicitante.getNombre() +"  "+ solicitante.getApellido();
         }else if(solicitante.getMembresiaU().getEstado()){
             return "Error: El usuario no debe devolver ningun libro.";
         }else{
             return "Error: El libro solicitado no debe ser devuelto por el usuario." + solicitante.getNombre() +"  "+ solicitante.getApellido();
         }
    }
}
