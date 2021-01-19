package br.com.tdd;

public class Partida {

	private Jogador jogadorUm;
	private Jogador jogadorDois;

	public void adicionarJogadores(Jogador jogadorUm, Jogador jogadorDois) {
		this.jogadorUm = jogadorUm;
		this.jogadorDois = jogadorUm;
	}
	
	public void iniciarPartida( Jogadas jogadaJogadorUm, Jogadas jogadaJogadorDois ) {
		verificarJogadas(jogadaJogadorUm, jogadaJogadorDois);
	}
	
	public void verificarJogadas(Jogadas jogadaJogadorUm, Jogadas jogadaJogadorDois ) {
		
		if (jogadaJogadorUm.ganha(jogadaJogadorDois)) {
			jogadorUm.addVitorias();
			jogadorDois.addDerrotas();
			System.out.println("Venceu: jogador 1! Número de vitórias: " + jogadorUm.getVitorias());
		} else if (jogadaJogadorUm.perde(jogadaJogadorDois)) {
			jogadorUm.addDerrotas();
			jogadorDois.addVitorias();
			System.out.println("Perdeu: jogador 1! Número de derrotas: " + jogadorUm.getDerrotas());
		} else {
			System.out.println("Empate!");
		}
	}	
}
