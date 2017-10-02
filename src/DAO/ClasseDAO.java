package DAO;

import Model.Classe;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ClasseDAO implements InterfaceDAO<Classe> {

	PreparedStatement create;
	PreparedStatement insert;
	PreparedStatement update;
	PreparedStatement delete;
	PreparedStatement search;

	@Override
	public void adicionarDAO(Classe t) {

		double teste;

		try {

			String createSQL = "" +
					"CREATE TABLE IF NOT EXISTS Classe" +
					"(" +
					"    ID serial primary key not null unique," +
					"    Nome char (20)," +
					"    Descricao char(100)," +
					"    Tipo char (10)," +
					"    AtributoAgilidade double precision not null," +
					"    AtributoForca double precision not null," +
					"    AtributoInteligencia double precision not null" +
					");";

			create = ConexaoDAO.getInstance().getConexao().prepareStatement(createSQL);
			create.executeUpdate();
			create.close();

			String insertSQL = ""
					+ "INSERT INTO classe ("
					+ "Nome,"
					+ "Descricao,"
					+ "AtributoAgilidade,"
					+ "AtributoForca,"
					+ "AtributoInteligencia,"
					+ "Tipo"
					+ ")"
					+ "Values("
					+ "?,"
					+ "?,"
					+ "?,"
					+ "?,"
					+ "?,"
					+ "?"
					+ ");";

			insert = ConexaoDAO.getInstance().getConexao().prepareStatement(insertSQL);

//			insert.setInt(1, t.getId());
			insert.setString(1, t.getNome());
			insert.setString(2, t.getDescricao());
			insert.setObject(3, Classe.ATRIBUTO.AGILIDADE.getValor());
			insert.setObject(4, Classe.ATRIBUTO.AGILIDADE.getValor());
			insert.setObject(5, Classe.ATRIBUTO.AGILIDADE.getValor());
			insert.setString(6, t.getTipo().toString());
			insert.executeUpdate();
			insert.close();

		}catch (SQLException e){
			e.getMessage();
		}
	}

	@Override
	public void atualizarDAO(Classe t, int id) {
		// TODO Auto-generated method stub
	}

	@Override
	public void removerDAO(Classe t, int id) {
		// TODO Auto-generated method stub
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Classe> listarDAO(Classe t) {
		// criar retorno da lista
		return (List<Classe>) t;
	}

	@Override
	public void buscarDAO(Classe t, int id) {
		// TODO Auto-generated method stub
	}
}
