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
     public void imprimirDados(){
        System.out.println("Nome:"+this.getNome()+" CPF:"+this.getCpf()+" Telefone:"+this.getTelefone()+" Email:"+this.getEmail()+" Endereço:"+this.getEndereco().toString()+" Código:"+this.codigo);
    }
}
