package com.revisao.ecommerce.dto;

import com.revisao.ecommerce.entities.ItemDoPedido;

public class ItemDoPedidoDTO {

	private Long produtoId;
	private String nome;
	private int quantidade;
	private double preco;
	private String urlImg;
	
	public ItemDoPedidoDTO(){
		
	}
	
	public ItemDoPedidoDTO(Long produtoId, String nome, int quantidade, double preco, String urlImg) {
		this.produtoId = produtoId;
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
		this.urlImg = urlImg;
	}
	
	public ItemDoPedidoDTO(ItemDoPedido entity) {
		this.produtoId = entity.getProduto().getId();
		this.nome = entity.getProduto().getNome();
		this.quantidade = entity.getQuantidade();
		this.preco = entity.getPreco();
		this.urlImg = entity.getProduto().getImgUrl();
	}

	public Long getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(Long produtoId) {
		this.produtoId = produtoId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getUrlImg() {
		return urlImg;
	}

	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}
	
	public Double getSubTotal() {
		return preco * quantidade ;
	}
	
}
