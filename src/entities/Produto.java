package entities;

public class Produto {
    private String nome;
    private Double preco;
    private int id;
    
    
    
    //Constructor
    public Produto(String nome, Double preco, int id) {
        this.nome = nome;
        this.preco = preco;
        this.id = id;
    }
    
    
    //Getters and Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }


    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", id=" + id + "]";
    }


    

    
}
