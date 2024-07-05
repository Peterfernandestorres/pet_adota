package br.com.pet_adota.dominio;

public class Animal {
	private Integer id_animais;
	private String nome;
	private String genero;
	private String descricao;

	private String raca;
	
	public Integer getId_Animais() {
		return id_animais;
	}
	public void setId_Animais(Integer id_Animais) {
		this.id_animais = id_Animais;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String Nome) {
		this.nome = Nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String Genero) {
		this.genero = Genero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setSinopse(String Descricao) {
		this.descricao = Descricao;
	}
	public String getRaca() {
		return raca;
	}
	public void setCapa(String Raca) {
		this.raca = Raca;
	}
}
