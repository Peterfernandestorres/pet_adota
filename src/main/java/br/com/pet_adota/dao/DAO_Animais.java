package br.com.pet_adota.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAO_Animais extends Conexao_Pet implements CRUD_Animais<Animais> {
	public String cadastrar (Animais dados) {
		String msg = "";
		try {
			if(abrirConexao()) {
				String sql = "insert into animais(nome,genero,descricao,capa)values(?,?,?,?)";
//				Preparar a consulta para a Execução
				pst = con.prepareStatement(sql);
//				passagem dos parametros para a consulta
				pst.setString(1, dados.getNome());
				pst.setString(2, dados.getGenero());
				pst.setString(3, dados.getDescricao());
				pst.setString(4, dados.getRaca());
				
				if(pst.executeUpdate() > 0 ) {
					msg = "Cadastro Realizado";
				}
				else {
					msg = "Não Foi Possivel Cadastrar";
				}
			}
			else {
				msg = "Não Foi Possivel Estabelescer a Conexão Com o Banco";
			}
		}
		catch(SQLException se) {
			msg = "Erro ao Tentar Cadastrar, Erro: "+se.getMessage();
		}
		catch(Exception e) {
			msg = "Erro Inesperado, Erro: "+e.getMessage();
		}
		finally {
			fecharConexao();
		}
		return msg;
	}

	@Override
	public List<Animais> listar() {
		List<Animais> lista = new ArrayList<Animais>();
		try {
			if (abrirConexao()) {
				String sql = "Select * from livro order by id_animais desc";
				pst = con.prepareStatement(sql);
				rs = pst.executeQuery();
				while (rs.next()) {
					Animais liv = new Animais();
					liv.setId_Animais(rs.getInt(1));
					liv.setNome(rs.getString(2));
					liv.setGenero(rs.getString(3));
					liv.setDescricao(rs.getString(4));
					liv.setRaca(rs.getString(5));
					
					lista.add(liv);
				}
			}
			else {
				new Exception ("Não Foi Possivel Estabalescer a Conexão Com o Banco");
			}
		}
		catch (SQLException se) {
			new Exception ("Erro Na Consulta, Erro: "+se.getMessage());
		}
		catch (Exception e ) {
			new Exception ("Erro Inesperado, Erro: "+e.getMessage());
		}
		finally {
			fecharConexao();
		}
		return lista;
	}

	@Override
	public Animais pesquisar(Animais dados) {
		Animais liv = null;
		try {
			if (abrirConexao()) {
				String sql = "Select * from livro where idlivro = ? or titulo = ?";
				pst = con.prepareStatement(sql);
				pst.setInt(1,dados.getId_ANimais());
				pst.setString(2, dados.getNome());
				rs = pst.executeQuery();
				if (rs.next()) {
					liv = new Animais();
					liv.setId_Animais(rs.getInt(1));
					liv.setNome(rs.getString(2));
					liv.setGenero(rs.getString(3));
					liv.setDescricao(rs.getString(4));
					liv.setRaca(rs.getString(5));
					
				}
			}
			else {
				new Exception ("Não Foi Possivel Estabalescer a Conexão Com o Banco");
			}
		}
		catch (SQLException se) {
			new Exception ("Erro Na Consulta, Erro: "+se.getMessage());
		}
		catch (Exception e ) {
			new Exception ("Erro Inesperado, Erro: "+e.getMessage());
		}
		finally {
			fecharConexao();
		}
		return liv;
	}

	@Override
	public String atualizar(Animais dados) {
		String msg = "";
		try {
			if(abrirConexao()) {
				String sql = "Update livro set Nome=?,genero=?,descricao=?,raca=? where id_animais=?";
//				Preparar a consulta para a Execução
				pst = con.prepareStatement(sql);
//				passagem dos parametros para a consulta
				pst.setString(1, dados.getNome());
				pst.setString(2, dados.getGenero());
				pst.setString(3, dados.getDescricao());
				pst.setString(4, dados.getRaca());
				pst.setInt(5, dados.getId_Animais());
				
				if(pst.executeUpdate() > 0 ) {
					msg = "Atualização Realizada";
				}
				else {
					msg = "Não Foi Possivel Atualizar";
				}
			}
			else {
				msg = "Não Foi Possivel Estabelescer a Conexão Com o Banco";
			}
		}
		catch(SQLException se) {
			msg = "Erro ao Tentar Atualizar, Erro: "+se.getMessage();
		}
		catch(Exception e) {
			msg = "Erro Inesperado, Erro: "+e.getMessage();
		}
		finally {
			fecharConexao();
		}
		return msg;
	}

	@Override
	public String apagar(Integer id) {
		String msg = "";
		try {
			if(abrirConexao()) {
				String sql = "delete from livro where id_Animais=?";
//				Preparar a consulta para a Execução
				pst = con.prepareStatement(sql);
//				passagem dos parametros para a consulta
				pst.setInt(1, id);
				
				if(pst.executeUpdate() > 0 ) {
					msg = "Deletado com sucesso";
				}
				else {
					msg = "Não Foi Possivel Deletar";
				}
			}
			else {
				msg = "Não Foi Possivel Estabelescer a Conexão Com o Banco";
			}
		}
		catch(SQLException se) {
			msg = "Erro ao Tentar Deletar, Erro: "+se.getMessage();
		}
		catch(Exception e) {
			msg = "Erro Inesperado, Erro: "+e.getMessage();
		}
		finally {
			fecharConexao();
		}
		return msg;
	}

}
