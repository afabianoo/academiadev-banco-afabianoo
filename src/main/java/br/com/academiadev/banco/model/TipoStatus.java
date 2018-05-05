package br.com.academiadev.banco.model;

public enum TipoStatus {

	ATIVO(0, "Ativo"), INATIVO(1, "Inativo"), CONGELADA(2, "Congelada");

	private Integer id;
	private String descricao;

	private TipoStatus(Integer id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
