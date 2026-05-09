package ec.edu.ups.bibliotecatrabajogrupal.Objeto;

public class Membresia {
    private String tipoMembresia;
    private boolean estado;
    private String codigoDeMembresia;

    public Membresia() {
    }

    public Membresia(String tipoMembresia, boolean estado, String codigoDeMembresia) {
        this.tipoMembresia = tipoMembresia;
        this.estado = estado;
        this.codigoDeMembresia = codigoDeMembresia;
    }

    public String getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(String tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getCodigoDeMembresia() {
        return codigoDeMembresia;
    }

    public void setCodigoDeMembresia(String codigoDeMembresia) {
        this.codigoDeMembresia = codigoDeMembresia;
    }
    
    @Override 
    public String toString(){
        String resultado = """
                           === Datos de la Membresia
                           """;
        resultado+= "tipo: "+ tipoMembresia + "\n";
        resultado+= "estado: ";
        if(!estado){
           resultado+= "Inactiva" + "\n";
        }else{
            resultado+= "Activa" + "\n";
        }
        resultado+= "Codigo Membresia: " + codigoDeMembresia;
        return resultado;
    }
}
