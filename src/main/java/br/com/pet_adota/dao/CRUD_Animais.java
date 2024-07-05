package br.com.pet_adota.dao;

import java.util.List;

public interface CRUD_Animais<T> {
	String cadastrar(T dados);
	List<T> listar();
	T pesquisar(T dados);
	String atualizar(T dados);
	String apagar(Integer id);
	
}
