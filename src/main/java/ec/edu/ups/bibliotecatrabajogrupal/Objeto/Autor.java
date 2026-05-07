package ec.edu.ups.bibliotecatrabajogrupal.Objeto;
import java.util.Date;
public class Autor extends Persona {
    private String seudonimo;
    private String nacionalidad;
    private String generoAutor;
    private List<Libro> librosAutor
    
    public Autor(){ 
    }
    public Autor(String nombre,String cedula, Date fechaNac,String apellido, String seudonimo, String nacionalidad ,String generoAutor){
        super(nombre,cedula,fechaNac,apellido);
        this.seudonimo = seudonimo;
        this.nacionalidad = nacionalidad;
        this.generoAutor = generoAutor;
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
    
    
    @Override
     public String toString(){
        String resultado = "\n";
        resultado += "Apodo: " + seudonimo + "\n";
        resultado += "Nacionalidad: " + nacionalidad + "\n";
        resultado += "Genero del Autor: " + generoAutor;
        return resultado;
    }
    
}
