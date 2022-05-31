package Transportadora;


public class Funcionario extends Pessoa{
    private double salario;
    
    

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
        public void imprimiDados(){
        System.out.println("Nome:"+this.getNome()+"CPF:"+getCpf()+"Telefone:"+getTelefone()+"Email:"+getEmail()+"Endereço:"+getEndereco()+"Código:"+salario);
    }
}
