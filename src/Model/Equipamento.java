/**
 * 
 */
package Model;

/**
 * @author suporte
 *
 */

public class Equipamento {

	public enum TIPO {
		ARMADURA, ARMA, SKIN;
	}
	
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
	
	public Equipamento() {
		
	}
	
	public Equipamento(int id, String nome, String descricao, double FORCA, double AGILIDADE, double INTELIGENCIA, TIPO tipo) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		ATRIBUTO.FORCA.setValor(FORCA);
		ATRIBUTO.AGILIDADE.setValor(AGILIDADE);
		ATRIBUTO.INTELIGENCIA.setValor(INTELIGENCIA);
		this.tipo = tipo;
	}
	
	private int id;
	private String nome;
	private String descricao;
	private TIPO tipo;

	public TIPO getTipo() {
		return tipo;
	}
	public void setTipo(TIPO tipo) {
		this.tipo = tipo;
	}

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
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
