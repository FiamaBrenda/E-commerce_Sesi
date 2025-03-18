package com.revisao.ecommerce.dto;

import java.util.ArrayList;
import java.util.List;

import com.revisao.ecommerce.entities.Categoria;
import com.revisao.ecommerce.entities.Produto;

public class ProdutoDTO {

	private Long id;
	private String nome;
	private String descricao;
	private Double preco;
	private String imgUrl;

	private List<CategoriaDTO> categorias = new ArrayList<>();

	public ProdutoDTO() {
	}

	public ProdutoDTO(String nome, String descricao, Double preco, String imgUrl) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.imgUrl = imgUrl;
	}

	public ProdutoDTO(Produto entity) {
		id = entity.getId();
		nome = entity.getNome();
		descricao = entity.getDescricao();
		preco = entity.getPreco();
		imgUrl = entity.getImgUrl();
		for (Categoria cat : entity.getCategorias()) {
			categorias.add(new CategoriaDTO(cat));
		}
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public List<CategoriaDTO> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<CategoriaDTO> categorias) {
		this.categorias = categorias;
	}

}
