package entities;

public class ItensPedido {
    private Integer quantidade;
    private Double preco;

    
    
    //constructor
    public ItensPedido(Integer quantidade, Double preco) {
        this.quantidade = quantidade;
        this.preco = preco;
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

    
}
