package Transportadora;


public class Funcionario extends Pessoa implements Pagamento{
    private double salario;
    
    

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
        public void imprimirDados(){
        System.out.println("Nome:"+this.getNome()+" CPF:"+getCpf()+" Telefone:"+getTelefone()+" Email:"+getEmail()+" Endereço:"+getEndereco()+" Salário:"+salario);
    }

    public double calculaPagamento(){
        return this.salario;
    }
}
