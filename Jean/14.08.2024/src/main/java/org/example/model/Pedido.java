package org.example.model;

public class Pedido {

    private int idPedido;
    private Produto produto;
    double totalCarrinho;

    public Pedido(int idPedido, Produto produto, double totalCarrinho) {
        this.idPedido = idPedido;
        this.produto = produto;
        this.totalCarrinho = totalCarrinho;
    }

    public Pedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.idPedido = idPedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public double getTotalCarrinho() {
        return totalCarrinho;
    }

    public void setTotalCarrinho(double totalCarrinho) {
        this.totalCarrinho = totalCarrinho;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    @Override
    public String toString() {
        return "| Pedido numero: " + idPedido + "\n" + produto + "\n| Total: " + totalCarrinho;
    }
}
