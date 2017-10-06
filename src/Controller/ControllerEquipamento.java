package Controller;

import Model.DAO.EquipamentoDAO;
import Model.Entidade.Equipamento;
import java.util.List;

public class ControllerEquipamento implements InterfaceController<Equipamento>{

	EquipamentoDAO equipamentoDAO = new EquipamentoDAO();

	@Override
	public void adicionar(Equipamento t) {
		equipamentoDAO.adicionarDAO(t);
	}

	@Override
	public void atualizar(Equipamento t, int id) {
		equipamentoDAO.atualizarDAO(t, id);
	}

	@Override
	public void remover(Equipamento t, int id) {
		equipamentoDAO.removerDAO(t, id);
	}

	@Override
	public List<Equipamento> listar(Equipamento t) {
		return equipamentoDAO.listarDAO(t);
	}

	@Override
	public void buscar(Equipamento t, int id) {
		equipamentoDAO.buscarDAO(t, id);
	}

}
