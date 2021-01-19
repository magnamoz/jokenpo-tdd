package br.com.tdd.main;

import br.com.tdd.Jogadas;
import br.com.tdd.Jogador;
import br.com.tdd.Partida;

public class Main {

	public static void main(String[] args) {

		Jogador jogadorUm = new Jogador();;
		Jogador jogadorDois = new Jogador();;
		Partida partida = new Partida();
		
		partida.adicionarJogadores(jogadorUm, jogadorDois);
		partida.verificarJogadas(Jogadas.PEDRA, Jogadas.PAPEL);
		partida.verificarJogadas(Jogadas.TESOURA, Jogadas.PAPEL);
		partida.verificarJogadas(Jogadas.PAPEL, Jogadas.PAPEL);
	}

}
