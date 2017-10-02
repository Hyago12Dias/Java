/**
 * 
 */
package Controller;

import java.util.List;

/**
 * @author suporte
 *
 */

public interface InterfaceController<T> {

	void adicionar(T t);

	void atualizar(T t, int id);

	void remover(T t, int id);

	List<T> listar(T t);

	void buscar(T t, int id);

}

