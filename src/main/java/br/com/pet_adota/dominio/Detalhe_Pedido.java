package br.com.pet_adota.dominio;

public class Detalhe_Pedido {
	private Integer id_detalhe_pedido;
	private Integer id_pedido;
	private Integer id_animais;
	private Integer quantidade;

	
	
	public Integer getId_Detalhe_Pedido() {
		return id_detalhe_pedido;
	}
	public void setId_Detalhe_Pedido(Integer id_Detalhe_Pedido) {
		this.id_detalhe_pedido = id_Detalhe_Pedido;
	}
	public Integer getId_Pedido() {
		return id_pedido;
	}
	public void setIdpedido(Integer id_Pedido) {
		this.id_pedido = id_Pedido;
	}
	public Integer getId_Animais() {
		return id_animais;
	}
	public void setId_Animais(Integer id_Animais) {
		this.id_animais = id_Animais;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer Quantidade) {
		this.quantidade = Quantidade;
	}
}
