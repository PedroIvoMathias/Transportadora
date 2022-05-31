package Transportadora;


public class Cliente extends Pessoa{
    

    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    @Override
     public void imprimiDados(){
        System.out.println("Nome:"+this.getNome()+"CPF:"+getCpf()+"Telefone:"+getTelefone()+"Email:"+getEmail()+"Endereço:"+getEndereco()+"Código:"+this.codigo);
    }
}
