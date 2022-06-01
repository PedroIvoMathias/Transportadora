package Transportadora;


public class Gerente extends Funcionario{
    
    @Override
        public void imprimirDados(){
        System.out.println("Nome:"+this.getNome()+"CPF:"+getCpf()+"Telefone:"+getTelefone()+"Email:"+getEmail()+"Endereço:"+getEndereco()+"Código:"+getSalario());
    }

    
    public double calculaPagamento(){
        return super.calculaPagamento() * (1.4);
    }
}
