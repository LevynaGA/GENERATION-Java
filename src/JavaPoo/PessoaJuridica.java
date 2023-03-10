package JavaPoo;

public class PessoaJuridica extends Cliente {
    private String cnpj;
    
    public PessoaJuridica(String nome, String endereco, String telefone, String cnpj) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
    }
    
    public String getCnpj() {
        return cnpj;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public void visualizar() {
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("CNPJ: " + cnpj);
    }
}

