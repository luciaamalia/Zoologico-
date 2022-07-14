package domain;

public class Peixe extends Animal {
	private String corEscama;

	@Override
	public void locomover() {
		System.out.println("Está nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo lôdo");
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe não faz som");
	}

	public void soltarBolha() {
		System.out.println("Soltou uma bolha"); 
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
}
