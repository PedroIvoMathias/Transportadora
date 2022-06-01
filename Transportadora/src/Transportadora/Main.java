package Transportadora;


public class Main{
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
        
        Endereco end2 = new Endereco();
        end2.setCidade("São Paulo");
        end2.setBairro("Centro");
        end2.setEstado("SP");
        end2.setNumero(154);
        end2.setPais("Brasil");
        end2.setComplemento("Apartamento N° 34");
        end2.setLogradouro("Rua Teobaldo Gentil");
        end2.setCep("22035-511");
        
        Endereco end3 = new Endereco();
        end3.setCidade("Rio de Janeiro");
        end3.setBairro("Cosmos");
        end3.setEstado("Rio de Janeiro");
        end3.setNumero(154);
        end3.setPais("Brasil");
        end3.setComplemento("Casa");
        end3.setLogradouro("Rua Alguma Coisa");
        end3.setCep("12053-409");
       
        
        Cliente c = new Cliente();
        c.setNome("Claudio");
        c.setCodigo(12357);
        c.setCpf("09816273847");
        c.setEndereco(end1);
        c.setTelefone("22 999376634");
        c.imprimirDados();

        Data d1 = new Data();
        d1.setAno(2022);
        d1.setDia(29);
        d1.setMes(7);
        d1.setHorario("16:30");

        Funcionario f = new Funcionario();
        
        f.setNome("Lucas");
        f.setSalario(1000);
        f.setCpf("78967567382");
        f.setEndereco(end2);
        f.setTelefone("21 986765734");
        f.imprimirDados();

        Gerente g = new Gerente();
        g.setNome("Alberto");
        g.calculaPagamento();
        g.setCpf("08976546521");
        g.setEndereco(end3);
        g.setTelefone("22 995664236");
        g.imprimirDados();

        Caixa caixa = new Caixa();
        caixa.setAltura(1.02);
        caixa.setComprimento(0.56);
        caixa.setLargura(0.43);
        caixa.setPeso(1.1);
    }
}

    
    
