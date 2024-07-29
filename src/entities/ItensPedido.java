package entities;

public class ItensPedido {
    private Integer quantidade;
    private Double preco;

    private Produto produto;

    
    
    //constructor
    public ItensPedido(Integer quantidade, Double preco, Produto produto) {
        this.quantidade = quantidade;
        this.preco = Produto.preco;
        this.produto = produto;
    }


    //methods
    public double subTotal(){
        return quantidade * preco;
    }

    
    //Getters and Setters
    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }


    @Override
    public String toString() {
        return "ItensPedido [quantidade=" + quantidade + ", preco=" + preco + ", produto=" + produto + "]";
    }

    

    
}
