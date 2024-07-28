package entities;

import java.util.Date;

import entities.enums.StatusPedido;

public class Pedido {
    private Date momentoDoPedido;
    private StatusPedido status;

    //constructor
    public Pedido(Date momentoDoPedido, StatusPedido status) {
        this.momentoDoPedido = momentoDoPedido;
        this.status = status;
    }

    //methods
    public void addItem(ItensPedido item){

    }

    public void removerItem(ItensPedido item){

    }

    public void total(){

    }


    //getters and setters
    public Date getMomentoDoPedido() {
        return momentoDoPedido;
    }

    public void setMomentoDoPedido(Date momentoDoPedido) {
        this.momentoDoPedido = momentoDoPedido;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    
}
