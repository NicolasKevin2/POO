package classes;

public class agencia {

    private int codigo;
    private String nome_ag;
    private String endereco;
    private String nome_gerente;
    //construtor para compactar set
    public agencia(int codigo, String nome_ag, String endereco, String nome_gerente) {
        this.codigo = codigo;
        this.nome_ag = nome_ag;
        this.endereco = endereco;
        this.nome_gerente = nome_gerente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome_ag() {
        return nome_ag;
    }

    public void setNome_ag(String nome_ag) {
        this.nome_ag = nome_ag;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome_gerente() {
        return nome_gerente;
    }

    public void setNome_gerente(String nome_gerente) {
        this.nome_gerente = nome_gerente;
    }

    public String getMovimentacao() {
        return movimentacao;
    }

    public void setMovimentacao(String movimentacao) {
        this.movimentacao = movimentacao;
    }

    private String movimentacao;
}
