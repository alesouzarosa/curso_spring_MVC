package com.example.demo.dto;

import com.example.demo.model.Pedido;

public class RequisicaoNovoPedido {

    private String nomePrduto;
    private String urlProduto;
    private String urlImagem;
    private String descricao;

    public String getNomePrduto() {
        return nomePrduto;
    }

    public void setNomePrduto(String nomePrduto) {
        this.nomePrduto = nomePrduto;
    }

    public String getUrlProduto() {
        return urlProduto;
    }

    public void setUrlProduto(String urlProduto) {
        this.urlProduto = urlProduto;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Pedido toPedido() {
        Pedido pedido = new Pedido();
        pedido.setDescricao(descricao);
        pedido.setNomeProduto(nomePrduto);
        pedido.setUrlImagem(urlImagem);
        pedido.setUlrProduto(urlProduto);
        return pedido;
    }
}
