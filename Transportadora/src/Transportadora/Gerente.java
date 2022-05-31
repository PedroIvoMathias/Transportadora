package Transportadora;


public class Gerente extends Funcionario{
    
    @Override
        public void imprimiDados(){
        System.out.println("Nome:"+this.getNome()+"CPF:"+getCpf()+"Telefone:"+getTelefone()+"Email:"+getEmail()+"Endereço:"+getEndereco()+"Código:"+getSalario());
    }
}
