package Transportadora;


public class Gerente extends Funcionario{


    public Gerente() {
    }
    
    
    @Override
        public void imprimirDados(){
        System.out.println("Nome:"+this.getNome()+" CPF:"+getCpf()+" Telefone:"+getTelefone()+" Email:"+getEmail()+" Endereço:"+getEndereco().toString()+" Salário:"+this.calculaPagamento());
    }

    @Override
    public double calculaPagamento(){
        return super.calculaPagamento() * (1.4);
    }
    
}
