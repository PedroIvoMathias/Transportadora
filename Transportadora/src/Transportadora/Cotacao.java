package Transportadora;


public class Cotacao {
    private Endereco cepOrigem,cepDestino;
    private int quantidadeCaixa;
    private Caixa dimensaoCaixa;

    public Cotacao() {
    }
    
    public Cotacao(Endereco cepOrigem, Endereco cepDestino, int quantidadeCaixa, Caixa dimensaoCaixa) {
        this.cepOrigem = cepOrigem;
        this.cepDestino = cepDestino;
        this.quantidadeCaixa = quantidadeCaixa;
        this.dimensaoCaixa = dimensaoCaixa;
    }

    public Endereco getCepOrigem() {
        return cepOrigem;
    }

    public void setCepOrigem(Endereco cepOrigem) {
        this.cepOrigem = cepOrigem;
    }

    public Endereco getCepDestino() {
        return cepDestino;
    }

    public void setCepDestino(Endereco cepDestino) {
        this.cepDestino = cepDestino;
    }

    public int getQuantidadeCaixa() {
        return quantidadeCaixa;
    }

    public void setQuantidadeCaixa(int quantidadeCaixa) {
        this.quantidadeCaixa = quantidadeCaixa;
    }

    public Caixa getDimensaoCaixa() {
        return dimensaoCaixa;
    }

    public void setDimensaoCaixa(Caixa dimensaoCaixa) {
        this.dimensaoCaixa = dimensaoCaixa;
    }
    
    
    public double CalculoPrecoBase(){
        if(this.dimensaoCaixa.getAltura() * this.dimensaoCaixa.getLargura() * this.dimensaoCaixa.getComprimento() + this.dimensaoCaixa.getPeso() >= 6){
            if(this.cepOrigem.getEstado() != this.cepDestino.getEstado()){
                if(this.quantidadeCaixa >=8){
                    return 3500.0;
                }
            }
        }
        return 2000.0; 
    }
    
    
}
