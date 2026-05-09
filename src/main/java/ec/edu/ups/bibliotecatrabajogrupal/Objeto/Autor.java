package ec.edu.ups.bibliotecatrabajogrupal.Objeto;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
public class Autor extends Persona {
    private String seudonimo;
    private String nacionalidad;
    private String generoAutor;
    private List<Libro> librosAutores;
    
    public Autor(){ 
        this.librosAutores = new ArrayList();
    }
    public Autor(String nombre,String cedula, Date fechaNac,String apellido, String seudonimo, String nacionalidad ,String generoAutor){
        super(nombre,cedula,fechaNac,apellido);
        this.seudonimo = seudonimo;
        this.nacionalidad = nacionalidad;
        this.generoAutor = generoAutor;
        this.librosAutores = new ArrayList();
    }
    public String getSeudonimo() {
        return seudonimo;
    }

    public void setSeudonimo(String seudonimo) {
        this.seudonimo = seudonimo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getGeneroAutor() {
        return generoAutor;
    }

    public void setGeneroAutor(String generoAutor) {
        this.generoAutor = generoAutor;
    }
    
    public void agregarLibro(Libro libritos){
        librosAutores.add(libritos);
    }
    
    @Override
     public String toString(){
        String resultado = "\n";
        resultado += " === DATOS AUTOR ===" + "\n";
        resultado +=  super.toString() + "\n"; 
        resultado += "Apodo: " + seudonimo + "\n";
        resultado += "Nacionalidad: " + nacionalidad + "\n";
        resultado += "Genero del Autor: " + generoAutor;
        return resultado;
    }
    
}
