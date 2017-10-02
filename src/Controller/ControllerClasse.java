package Controller;

import DAO.ClasseDAO;
import Model.Classe;
import java.util.List;

public class ControllerClasse implements InterfaceController<Classe>{
	
	ClasseDAO classeDao = new ClasseDAO();

	@Override
	public void adicionar(Classe t) {
		classeDao.adicionarDAO(t);
	}

	@Override
	public void atualizar(Classe t, int id) {
		classeDao.atualizarDAO(t, id);
	}

	@Override
	public void remover(Classe t, int id) {
		classeDao.removerDAO(t, id);
	}

	@Override
	public List<Classe> listar(Classe t) {
		return classeDao.listarDAO(t);
	}

	@Override
	public void buscar(Classe t, int id) {
		classeDao.buscarDAO(t, id);
	}
}
