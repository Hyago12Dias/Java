/**
 * 
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author suporte
 *
 */

public class  Personagem {

	public enum ATRIBUTO {
		FORCA(0.0), AGILIDADE(0.0), INTELIGENCIA(0.0);

		public double valor;

		private ATRIBUTO(double valor) {
			this.valor = valor;
		}

		public double getValor() {
			return valor;
		}

		public void setValor(double valor) {
			this.valor = valor;
		}
	}
	
	public Personagem() {
		
	}
	
	public Personagem(int id, String nome, double FORCA, double AGILIDADE, double INTELIGENCIA) {
		this.id = id;
		this.nome = nome;
		ATRIBUTO.FORCA.setValor(FORCA);
		ATRIBUTO.AGILIDADE.setValor(AGILIDADE);
		ATRIBUTO.INTELIGENCIA.setValor(INTELIGENCIA);
	}
	
	private int id;
	private String nome;
	private Classe classe;
	private List<Equipamento> equipamentoList;
	private int xp;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Classe getClasse() {
		return classe;
	}
	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	public List<Equipamento> getEquipamentoList() {
		return equipamentoList;
	}
	public void setEquipamentoList(List<Equipamento> equipamentoList) {
		this.equipamentoList = equipamentoList;
	}

	public int getXp() {
		return xp;
	}
	public void setXp(int xp) {
		this.xp = xp;
	}
}
