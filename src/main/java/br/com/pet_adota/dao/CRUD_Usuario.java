package br.com.pet_adota.dao;

public interface CRUD_Usuario<T> extends CRUD_Animais<T> {
	boolean login(T dados);
	String alterarSenha(T dados);

}
