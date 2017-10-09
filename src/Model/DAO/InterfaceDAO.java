package Model.DAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface InterfaceDAO<T> {

	void adicionarDAO(T t) throws SQLException, IOException;

	void atualizarDAO(T t, int id);

	void removerDAO(T t, int id);

	List<T> listarDAO(T t);

	void buscarDAO(T t, int id);

}
