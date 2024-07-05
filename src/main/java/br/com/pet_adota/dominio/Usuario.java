package br.com.pet_adota.dominio;

public class Usuario {
	private Integer id_usuario;
	private String nome_usuario;
	private String senha;
	private String email;
	private String telefone;
	private String nome_completo;
	private String cpf;
	
	
	public Integer getIdusuario() {
		return id_usuario;
	}
	public void setIdusuario(Integer idusuario) {
		this.id_usuario = idusuario;
	}
	public String getNome_Usuario() {
		return nome_usuario;
	}
	public void setNome_Usuario(String nome_Usuario) {
		this.nome_usuario = nome_Usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNome_Completo() {
		return nome_completo;
	}
	public void setNome_Completo(String nome_Completo) {
		this.nome_completo = nome_Completo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
