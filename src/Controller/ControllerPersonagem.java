package Controller;

import Model.DAO.PersonagemDAO;
import Model.Entidade.Personagem;
import java.util.List;

public class ControllerPersonagem implements InterfaceController<Personagem>{

	PersonagemDAO personagemDAO = new PersonagemDAO();

	@Override
	public void adicionar(Personagem t) {
		personagemDAO.adicionarDAO(t);
	}

	@Override
	public void atualizar(Personagem t, int id) {
		personagemDAO.atualizarDAO(t, id);
	}

	@Override
	public void remover(Personagem t, int id) {
		personagemDAO.removerDAO(t, id);
	}

	@Override
	public List<Personagem> listar(Personagem t) {
		return personagemDAO.listarDAO(t);
	}

//	@Override
//	public void buscar(Personagem t, int id) {
//		personagemDAO.buscarDAO(t, id);
//	}

	@Override
	public void buscar(Personagem personagem) {
	}
}
