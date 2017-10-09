package Model.Entidade;

public class Classe {

	public enum TIPO {
		MELEE("MELEE"), RANGE("RANGE");

		public String valor;

		TIPO(String valor){
			this.valor = valor;
		}
		@Override
		public String toString() {
			return valor;
		}
	}

	public enum ATRIBUTO {
		FORCA(0.0), AGILIDADE(0.0), INTELIGENCIA(0.0);

		private double valor;

		ATRIBUTO(double att) {
			valor = att;
		}

		public double getValor() {
			return valor;
		}

		public void setValor(double valor) {
			this.valor = valor;
		}
	}
	
	public Classe() {
		
	}
	
	public Classe(String nome, String descricao, TIPO tipo, double agilidade, double forca, double inteligencia) {
		this.nome = nome;
		this.descricao = descricao;
		this.tipo = tipo;
		ATRIBUTO.AGILIDADE.setValor(agilidade);
        ATRIBUTO.FORCA.setValor(forca);
		ATRIBUTO.INTELIGENCIA.setValor(inteligencia);
	}

	private int id;
	private String nome;
	private String descricao;
	TIPO tipo;

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

	public TIPO getTipo() {
		return tipo;
	}
	public void setTipo(TIPO tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Classe [Nome = " + getNome() +
				", Descrição = " + getDescricao() +
				", Tipo = " + getTipo() +
				", Agilidade = " + ATRIBUTO.AGILIDADE.getValor() +
				", Força = " + ATRIBUTO.FORCA.getValor() +
				", Inteligencia = " + ATRIBUTO.INTELIGENCIA.getValor() + "]";
	}
}
