package models;

public class Endereco {

    private String rua;
    private String numCasa;
    private String bairro;
    private String estado;
    private String pais;

    public Endereco(String rua, String numCasa, String bairro, String estado, String pais) {
        this.rua = rua;
        this.numCasa = numCasa;
        this.bairro = bairro;
        this.estado = estado;
        this.pais = pais;
    }

    
    
    public Endereco(){       
    }   
    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(String numCasa) {
        this.numCasa = numCasa;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Endereco{" + "rua=" + rua + ", numCasa=" + numCasa + ", bairro=" + bairro + ", estado=" + estado + ", pais=" + pais + '}';
    }
       
    
}
