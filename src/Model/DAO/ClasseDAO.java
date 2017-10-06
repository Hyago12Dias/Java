package Model.DAO;

import Model.Entidade.Classe;
import Model.Entidade.Classe.TIPO;
import Model.Entidade.Classe.ATRIBUTO;

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
	public void adicionarDAO(Classe t){


		try {

			String createSQL = ""
					+ "CREATE TABLE IF NOT EXISTS \"Classe\" ("
					+ "\"ID\" serial primary key not null,"
					+ "\"Nome\" char (20),"
					+ "\"Descricao\" char(500),"
					+ "\"Tipo\" char (10),"
					+ "\"AtributoAgilidade\" double precision not null,"
					+ "\"AtributoForca\" double precision not null,"
					+ "\"AtributoInteligencia\" double precision not null"
					+ ");";

			create = ConexaoDAO.getInstance().getConexao().prepareStatement(createSQL);
			create.executeUpdate();
			create.close();

			String insertSQL = ""
					+ "INSERT INTO \"Classe\" ("
//					+ "\"ID\","
					+ "\"Nome\","
					+ "\"Descricao\","
					+ "\"Tipo\","
					+ "\"AtributoAgilidade\","
					+ "\"AtributoForca\","
					+ "\"AtributoInteligencia\""
					+ ")"
					+ "Values("
//					+ "?,"
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
			insert.setString(3, String.valueOf(t.getTipo()));
			insert.setObject(4, ATRIBUTO.AGILIDADE.getValor());
			insert.setObject(5, ATRIBUTO.FORCA.getValor());
			insert.setObject(6, ATRIBUTO.INTELIGENCIA.getValor());
			insert.executeUpdate();
			insert.close();

		}catch (SQLException e){
			e.getMessage();
		}

		/**
		FileWriter arq = new FileWriter("C:\\Users\\suporte\\Desktop\\teste.txt");
		PrintWriter gravarArq = new PrintWriter(arq);
		for (int i=0; i<1; i++) {
			gravarArq.println(t.getNome() + ", ");
			gravarArq.println(t.getDescricao() + " ");
			gravarArq.println(String.valueOf(t.getTipo()) + ", ");
			gravarArq.println(ATRIBUTO.AGILIDADE.getValor() + ", ");
			gravarArq.println(ATRIBUTO.FORCA.getValor() + ", ");
			gravarArq.println(ATRIBUTO.INTELIGENCIA.getValor());
		}

		arq.close();
		System.out.println(t);
		 **/
	}

	@Override
	public void atualizarDAO(Classe t, int id) {

//		try{
//
//			String updateSQL = ""
//					+ "UPDATE Classe SET "
//					+ "";
//
//		}catch (SQLException e){
//			e.getMessage();
//		}

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
