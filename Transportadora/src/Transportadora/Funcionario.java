package Transportadora;


public class Funcionario extends Pessoa implements Pagamento{
    private double salario;


    public Funcionario(double salario, String nome, String cpf, String telefone, String email, Endereco endereco) {
        super(nome, cpf, telefone, email, endereco);
        this.salario = salario;
    }
    
    public Funcionario(){
        
    }   
    

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public double calculaPagamento(){
        return this.getSalario() * (0.8);
    }
    
    @Override
        public void imprimirDados(){
        System.out.println("Nome:"+this.getNome()+" CPF:"+getCpf()+" Telefone:"+getTelefone()+" Email:"+getEmail()+" Endereço:"+getEndereco()+" Salário:"+this.calculaPagamento());
    }

    
}
