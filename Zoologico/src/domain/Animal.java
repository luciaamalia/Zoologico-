package domain;

public abstract class Animal {
	protected Float peso;
	protected int idade;
	protected int membros;

	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();

	@Override
	public String toString() {
		return "Animal [peso=" + this.getPeso() + ", idade=" + this.getIdade() + ", membros=" + this.getMembros() + "]";
	}

	// metodos modificadores e acessores
	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade++;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getMembros() {
		return membros;
	}

	public void setMembros(int membros) {
		this.membros = membros;
	}

}
