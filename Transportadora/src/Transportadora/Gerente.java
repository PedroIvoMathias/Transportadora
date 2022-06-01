package Transportadora;


public class Gerente extends Funcionario{
    
    @Override
        public void imprimirDados(){
        System.out.println("Nome:"+this.getNome()+" CPF:"+getCpf()+" Telefone:"+getTelefone()+" Email:"+getEmail()+" Endereço:"+getEndereco()+" Salário:"+this.getSalario());
    }

    
    public double calculaPagamento(){
        return super.calculaPagamento() * (1.4);
    }
}
