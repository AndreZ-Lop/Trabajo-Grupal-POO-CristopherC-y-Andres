package ec.edu.ups.bibliotecatrabajogrupal.Objeto;
public class Autor {
    private String nombre;
    private String apellido;
    private String seudonimo;
    private String nacionalidad;
    private String generoAutor;
    
    public Autor(){
        
    }
    public Autor(String nombre,String apellido,String seudonimo,String nacionalidad,String generoAutor){
        this.nombre = nombre;
        this.apellido =apellido;
        this.seudonimo =seudonimo;
        this.nacionalidad = nacionalidad;
        this.generoAutor = generoAutor;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
        resultado += "Nombre Autor: " + nombre + "\n";
        resultado += "Apellido Autor: " + apellido + "\n";
        resultado += "Apodo: " + seudonimo + "\n";
        resultado += "Nacionalidad: " + nacionalidad + "\n";
        resultado += "Genero del Autor: " + generoAutor;
        return resultado;
    }
    
}
