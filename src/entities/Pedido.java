package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.StatusPedido;

public class Pedido {
    private LocalDate momentoDoPedido;
    private StatusPedido status;

    private Cliente cliente;
    public List<ItensPedido> items = new ArrayList();

    //constructor
    public Pedido(LocalDate momentoDoPedido, StatusPedido status, Cliente cliente) {
        this.momentoDoPedido = momentoDoPedido;
        this.status = status;
        this.cliente = cliente;
    }

    

    public Pedido() {
    }



    //methods
    public void addItem(ItensPedido item){

    }

    public void removerItem(ItensPedido item){

    }

    public void total(){
        double total = 0;
        for (ItensPedido itensPedido : items) {
            total += itensPedido.subTotal();
                
        }
        System.out.println("Total a pagar: " + total);
        
    }


    //getters and setters
    public LocalDate getMomentoDoPedido() {
        return momentoDoPedido;
    }

    public void setMomentoDoPedido(LocalDate momentoDoPedido) {
        this.momentoDoPedido = momentoDoPedido;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido [momentoDoPedido=" + momentoDoPedido + ", status=" + status + ", cliente=" + cliente + "]";
    }

    
}
