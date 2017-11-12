package com.proj.lucas.mercairsoft.Entities;

import java.io.Serializable;

/**
 * Created by Lucas on 11/11/2017.
 */

public class Produto implements Serializable {

    private String id;
    private String produto;
    private String fabricante;
    private String modelo;
    private String descricao;

    public Produto() {
    }

    public Produto(String id, String produto, String fabricante, String modelo, String descricao) {
        this.id = id;
        this.produto = produto;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
