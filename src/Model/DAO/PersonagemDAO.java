package Model.DAO;

import java.util.List;

import Model.Entidade.Classe;
import Model.Entidade.Personagem;

public class PersonagemDAO implements InterfaceDAO<Personagem> {

	@Override
	public void adicionarDAO(Personagem t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}

	@Override
	public void atualizarDAO(Personagem t, int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removerDAO(Personagem t, int id) {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Personagem> listarDAO(Personagem t) {
		// criar retorno da lista

		return (List<Personagem>) t;
	}

	@Override
	public List<Classe> buscarDAO(Classe t) {
		return null;
	}

//	@Override
//	public List<Classe> buscarDAO(Personagem t, int id) {
//
//        return null;
//    }

}
