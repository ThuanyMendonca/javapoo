package br.edu.fatecfranca.ex0;

import java.util.Date;

public class Pedido {
    private int codigo;
    private Date data;
    private float valorTotal;
    //Associação
    private ItemPedido itemPedido;

    public Pedido() {
    }

    public Pedido(int codigo, Date data, float valorTotal, int codPedido, float vPedido, int qPedido) {
        this.codigo = codigo;
        this.data = data;
        this.valorTotal = valorTotal;
        //Cria o item pedido dentro do pedido, pq é composição
        this.itemPedido = new ItemPedido (codPedido,qPedido,vPedido);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public ItemPedido getItemPedido() {
        return itemPedido;
    }

    public void setItemPedido(int codPedido, float vPedido, int qPedido) {
        this.itemPedido = new ItemPedido (codPedido,qPedido,vPedido);
    }

    @Override
    public String toString() {
        return "Pedido{" + "codigo=" + codigo + ", data=" + data + ", valorTotal=" + valorTotal + ", itemPedido=" + itemPedido.toString() + '}';
    }
    
    
    
    
    
    
}
