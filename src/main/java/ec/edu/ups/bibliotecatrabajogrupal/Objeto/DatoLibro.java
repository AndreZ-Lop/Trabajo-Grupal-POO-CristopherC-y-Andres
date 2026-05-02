package ec.edu.ups.bibliotecatrabajogrupal.Objeto;

public class DatoLibro {
    private String titulo;
    private int iD;
    
    public DatoLibro (){
        
    }
    
    public DatoLibro(String titulo, int iD){
        this.titulo = titulo;
        this.iD = iD;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
     public int getId(){
        return iD;
    }
    
    public void setId(int iD){
        this.iD = iD;
    }
    
    @Override
    public String toString(){
        String resultado = "\n";
        resultado += "Titulo: " + titulo + "\n";
        resultado += "ID: " + iD;
        return resultado;
    }
    
}
