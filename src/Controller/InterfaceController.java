package Controller;

import java.io.IOException;
import java.util.List;

public interface InterfaceController<T> {

	void adicionar(T t) throws IOException;

	void atualizar(T t, int id);

	void remover(T t, int id);

	List<T> listar(T t);

	void buscar(T t, int id);

}

