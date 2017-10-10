package Model.DAO;

import java.util.List;

import Model.Entidade.Classe;
import Model.Entidade.Equipamento;

public class EquipamentoDAO implements InterfaceDAO<Equipamento> {

	@Override
	public void adicionarDAO(Equipamento t) {
		// TODO Auto-generated method stub
	}

	@Override
	public void atualizarDAO(Equipamento t, int id) {
		// TODO Auto-generated method stub
	}

	@Override
	public void removerDAO(Equipamento t, int id) {
		// TODO Auto-generated method stub
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Equipamento> listarDAO(Equipamento t) {
		// criar retorno da lista

		return (List<Equipamento>) t;
	}

	@Override
	public List<Classe> buscarDAO(Classe t) {
		return null;
	}

//	@Override
//	public List<Classe> buscarDAO(Equipamento t, int id) {
//        return null;
//    }
}
