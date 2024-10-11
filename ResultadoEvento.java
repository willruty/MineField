package br.com.Cod3r.cm.modelo;

public class ResultadoEvento {

	private final boolean ganhou;
	
	public ResultadoEvento(boolean ganhou) {
		super();
		this.ganhou = ganhou;
	}

	public boolean isGanhou() {
		return ganhou;
	}
}
