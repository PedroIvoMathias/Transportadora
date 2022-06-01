package Transportadora;


public class Cliente extends Pessoa{
    

    private int codigo;

    public Cliente() {
        
    }

    public Cliente(int codigo, String nome, String cpf, String telefone, String email, Endereco endereco) {
        super(nome, cpf, telefone, email, endereco);
        this.codigo = codigo;
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    @Override
     public void imprimirDados(){
        System.out.println("Nome:"+this.getNome()+" CPF:"+this.getCpf()+" Telefone:"+this.getTelefone()+" Email:"+this.getEmail()+" Endereço:"+this.getEndereco().toString()+" Código:"+this.codigo);
    }
}
