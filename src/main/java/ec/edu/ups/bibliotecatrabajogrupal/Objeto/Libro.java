package ec.edu.ups.bibliotecatrabajogrupal.Objeto;
import java.util.ArrayList;
import java.util.Date;
public class Libro {
    private String titulo;
    private int ISBN;
    private String genero;
    private Date fechaPublicacion;
    private Autor autorLibro;
    private String idiomaLibro;
    private boolean estado;
    private boolean restriccionesLibro;

    public Libro() {
        
    }

    public Libro(String titulo, int ISBN, String genero, Date fechaPublicacion, Autor autorLibro, String idiomaLibro, boolean estado, boolean restriccionesLibro) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.genero = genero;
        this.fechaPublicacion = fechaPublicacion;
        this.autorLibro = autorLibro;
        this.idiomaLibro = idiomaLibro;
        this.estado = estado;
        this.restriccionesLibro = restriccionesLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Autor getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(Autor autorLibro) {
        this.autorLibro = autorLibro;
    }

    public String getIdiomaLibro() {
        return idiomaLibro;
    }

    public void setIdiomaLibro(String idiomaLibro) {
        this.idiomaLibro = idiomaLibro;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean getRestriccionesLibro() {
        return restriccionesLibro;
    }

    public void setRestriccionesLibro(boolean restriccionesLibro) {
        this.restriccionesLibro = restriccionesLibro;
    }
    
    
    
    @Override
     public String toString(){
        String resultado = "\n";
        resultado += "--- DATOS LIBRO --- " + "\n";
        resultado += titulo + "\n";
        resultado += ISBN + "\n";
        resultado += genero + "\n";
        resultado += fechaPublicacion + "\n";
        resultado += idiomaLibro + "\n";
        resultado += "--- AUTOR --- " + "\n";
        resultado += autorLibro + "\n";
        if (estado){
            resultado += "Disponible";
        }else{
            resultado += "No Disponible";
        }
        return resultado;
    }
}
