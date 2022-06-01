package Transportadora;


public class Main(){
    public static void main(String[] args) {

        Endereco end1 = new Endereco();
        end1.setCidade("Campos dos Goytacazes");
        end1.setBairro("Centro");
        end1.setEstado("Rio de Janeiro");
        end1.setNumero(154);
        end1.setPais("Brasil");
        end1.setComplemento("Casa");
        end1.setLogradouro("Rua Aquino Sales");
        end1.setCep("28013-510");

        Cliente c = new Cliente();
        c.setNome("Claudio");
        c.setCodigo(12357);
        c.setCpf("06798465231");
        c.setEndereco(end1);
        c.setTelefone("995664236");

        Data d1 = new Data();
        d1.setAno(2022);
        d1.setDia(29);
        d1.setMes(7);
        d1.setHorario("16:30");

        Funcionario f = new Funcionario();
        
        f.setNome("Claudio");
        f.setSalario(1000);
        f.setCpf("06798465231");
        f.setEndereco(end1);
        f.setTelefone("995664236");

        Gerente g = new Gerente();
        f.setNome("Alberto");
        f.calculaPagamento();
        f.setCpf("06798465231");
        f.setEndereco(end1);
        f.setTelefone("995664236");
        f.imprimirDados();

        Caixa caixa = new Caixa();
        caixa.setAltura(1.02);
        caixa.setComprimento(0.56);
        caixa.setLargura(0.43);
        caixa.setPeso(1.1);
    }
}

    
    
