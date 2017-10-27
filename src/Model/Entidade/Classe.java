package Model.Entidade;

import java.util.HashSet;
import java.util.Set;

public class Classe {

	public Classe() {
		
	}
	
	public Classe(String nome, String descricao, String tipo, int agilidade, int forca, int inteligencia) {
		this.nome = nome;
		this.descricao = descricao;
		this.tipo = tipo;
		Atributo.add(agilidade);
		Atributo.add(forca);
		Atributo.add(inteligencia);
	}

	private int id;
	private String nome;
	private String descricao;
	String tipo;
	Set<Integer> Atributo = new HashSet<>();

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

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Set<Integer> getAtributo() {
		return Atributo;
	}
	public void setAtributo(Set<Integer> atributo) {
		Atributo = atributo;
	}

	@Override
	public String toString() {
		return "Classe ID = " + getId() +
				", Nome = " + getNome() +
				", Descrição = " + getDescricao() +
				", Tipo = " + getTipo() +
				", Agilidade = " + Atributo +
				", Força = " + Atributo +
				", Inteligencia = " + Atributo;
	}
}
