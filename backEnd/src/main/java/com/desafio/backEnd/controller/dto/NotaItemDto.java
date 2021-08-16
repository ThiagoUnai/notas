package com.desafio.backEnd.controller.dto;

import com.desafio.backEnd.modelo.NotaItem;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class NotaItemDto {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("numero")
    private Integer numero;
    @JsonProperty("quantidade")
    private BigDecimal quantidade;
    @JsonProperty("numeroNota")
    private Integer numeroNota;
    @JsonProperty("nomeProduto")
    private String nomeProduto;


    public NotaItemDto() {

    }

    public NotaItemDto(NotaItem notaItem) {
        this.id = notaItem.getId();
        this.numero = notaItem.getNumero();
        this.quantidade = notaItem.getQuantidade();
        this.numeroNota = notaItem.getNota().getNumero();
        this.nomeProduto = notaItem.getProduto().getDescricao();
    }


    public Integer getId() {
        return id;
    }


    public Integer getNumero() {
        return numero;
    }


    public BigDecimal getQuantidade() {
        return quantidade;
    }


    public Integer getNumeroNota() {
        return numeroNota;
    }


    public void setNumeroNota(Integer numeroNota) {
        this.numeroNota = numeroNota;
    }


    public String getNomeProduto() {
        return nomeProduto;
    }


    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }


    public static List<NotaItemDto> converter(List<NotaItem> notaItem) {
        return notaItem.stream().map(NotaItemDto::new).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "NotaItemDto{" +
                "id=" + id +
                ", numero=" + numero +
                ", quantidade=" + quantidade +
                ", numeroNota=" + numeroNota +
                ", nomeProduto='" + nomeProduto + '\'' +
                '}';
    }
}
