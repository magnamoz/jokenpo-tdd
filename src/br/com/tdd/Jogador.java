package br.com.tdd;

public class Jogador {

	private int vitorias;
	private int derrotas;
	
	public int getVitorias() {
		return vitorias;
	}
	
	public int getDerrotas() {
		return derrotas;
	}
	
	public void addVitorias() {
		this.vitorias++;
	}
	
	public void addDerrotas() {
		this.derrotas++;
	}
}
