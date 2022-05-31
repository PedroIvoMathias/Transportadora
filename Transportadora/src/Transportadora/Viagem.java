package Transportadora;


public class Viagem {

    private Data dataSaida;
    private Data dataChegada;

    public Viagem() {
    }
    
    public Viagem(Data dataSaida, Data dataChegada) {
        this.dataSaida = dataSaida;
        this.dataChegada = dataChegada;
    }

    public Data getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Data dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Data getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(Data dataChegada) {
        this.dataChegada = dataChegada;
    }
    
}
