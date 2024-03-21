package classes;
public class cliente {
    private String nome;
    private int idade;
    private char sexo;
    private String endereco;
    private String cidade;

    // Construtor da classe Cliente
    public cliente(String nome, int idade, char sexo, String endereco, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.endereco = endereco;
        this.cidade = cidade;
    }

    // Método getter para o atributo nome
    public String getNome() {
        return nome;
    }

    // Método getter para o atributo idade
    public int getIdade() {
        return idade;
    }

    // Método getter para o atributo sexo
    public char getSexo() {
        return sexo;
    }

    // Método getter para o atributo endereco
    public String getEndereco() {
        return endereco;
    }

    // Método getter para o atributo cidade
    public String getCidade() {
        return cidade;
    }
}