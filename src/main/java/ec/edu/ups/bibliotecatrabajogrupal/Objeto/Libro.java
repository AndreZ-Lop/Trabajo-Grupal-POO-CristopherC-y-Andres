package ec.edu.ups.bibliotecatrabajogrupal.Objeto;
import java.util.ArrayList;
public class Libro {
    private DatoLibro nuevoLibro;
    private Autor autorLibro; 
    private boolean estado;

    public Libro() {
        
    }
    
    public Libro(boolean estado){
        this.estado=estado;
    }

    public Libro(DatoLibro nuevoLibro, Autor autorLibro) {
        this.nuevoLibro = nuevoLibro;
        this.autorLibro = autorLibro;
    }

    public DatoLibro getNuevoLibro() {
        return nuevoLibro;
    }

    public void setNuevoLibro(DatoLibro nuevoLibro) {
        this.nuevoLibro = nuevoLibro;
    }

    public Autor getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(Autor autorLibro) {
        this.autorLibro = autorLibro;
    }

    public boolean getEstado() {
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
    
    public String busquedaLibro(ArrayList<Libro>listaLibros,String libroBuscado){
        boolean busquedaAcer = false;
        String libroTitulo = "";
        Libro datosLibro = null;
        for(Libro busqueda:listaLibros){
            if(libroBuscado.equals(busqueda.getNuevoLibro().getTitulo())){
                busquedaAcer = true;
                libroTitulo = busqueda.getNuevoLibro().getTitulo();
                datosLibro = busqueda;
            }
        }
       if(!busquedaAcer){
          return "Los datos del libro: " + libroTitulo + "\n" + datosLibro;
       }else{
            return "No disponemos del libro que buscas";
        }
    }
     
}
