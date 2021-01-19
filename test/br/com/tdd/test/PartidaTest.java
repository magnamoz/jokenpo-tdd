package br.com.tdd.test;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.tdd.Jogadas;
import br.com.tdd.Jogador;
import br.com.tdd.Partida;

public class PartidaTest {

	private Jogador jogadorUm;
	private Jogador jogadorDois;
	
	private Partida partida;
	
	private final PrintStream systemOut = System.out;
	private ByteArrayOutputStream OutputStream = new ByteArrayOutputStream();


	@BeforeEach
	void setup() {
		System.setOut(new PrintStream(OutputStream));
		
		jogadorUm = new Jogador();
		jogadorDois = new Jogador();
		
		partida = new Partida();
		partida.adicionarJogadores(jogadorUm, jogadorDois);
	}
	
	@AfterEach
    void restoreSystemOutStream() {
		System.setOut(systemOut);
	}

	@Test
	void devePermitirJogadorUmVencer() throws Exception {
		partida.iniciarPartida(Jogadas.PEDRA, Jogadas.TESOURA);
		partida.iniciarPartida(Jogadas.PAPEL, Jogadas.PEDRA);
		partida.iniciarPartida(Jogadas.TESOURA, Jogadas.PAPEL);
		
		jogadorUm.addVitorias();
		jogadorDois.addDerrotas();
		
		assertTrue(jogadorUm.getVitorias() > jogadorDois.getVitorias());
	}
	
	@Test
	void devePermitirJogadorDoisVencer() throws Exception {
		partida.iniciarPartida(Jogadas.PEDRA, Jogadas.PAPEL);
		partida.iniciarPartida(Jogadas.PAPEL, Jogadas.TESOURA);
		partida.iniciarPartida(Jogadas.TESOURA, Jogadas.PEDRA);
				
		jogadorUm.addDerrotas();
		jogadorDois.addVitorias();
		
		assertTrue(jogadorUm.getDerrotas() >  jogadorDois.getDerrotas());
	}
	
	@Test
	void devePermitirEmpate() throws Exception {
		partida.iniciarPartida(Jogadas.PEDRA, Jogadas.PEDRA);
		partida.iniciarPartida(Jogadas.PAPEL, Jogadas.PAPEL);
		partida.iniciarPartida(Jogadas.TESOURA, Jogadas.TESOURA);
		
		assertTrue(OutputStream.toString().contains("Empate!"));
	}
}
