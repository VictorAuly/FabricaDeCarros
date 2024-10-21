package PJFabricaDeCarrosV2.Model;
public class Carro {
    protected String anoFabricacao;
    protected String modelo;
    protected String cor;

    public String getAnoFabricacao(){
        return this.anoFabricacao;
    }
    public void setAnoFabricacao(String anoFabricacao){
        this.anoFabricacao = anoFabricacao;
    }
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo (String modelo){
        this.modelo = modelo;
    }
    public String getCor() {
        return this.cor;
    }
    public void setCor (String cor){
        this.cor = cor;
    } 
    @Override
    public String toString() {
        
        return modelo + " - " + anoFabricacao + " - " + cor;
    }
}
