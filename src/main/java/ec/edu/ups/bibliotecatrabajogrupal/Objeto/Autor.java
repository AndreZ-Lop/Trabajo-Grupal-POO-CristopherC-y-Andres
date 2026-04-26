package ec.edu.ups.bibliotecatrabajogrupal.Objeto;
public class Autor {
    private String nombre;
    private String apellido;
    private String seudonimo;
    
    public Autor(){
        
    }
    public Autor(String nombre,String apellido,String seudonimo){
        this.nombre = nombre;
        this.apellido =apellido;
        this.seudonimo =seudonimo;
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
    
     public String toString(){
        String resultado = "\n";
        resultado += "Nombre Autor: " + nombre + "\n";
        resultado += "Apellido Autor: " + apellido + "\n";
        resultado += "Apodo: " + seudonimo;
        return resultado;
    }
    
}
