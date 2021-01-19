package br.com.tdd;

public enum Jogadas {

	PEDRA {
		@Override
		public boolean ganha(Jogadas jogada) {
			return jogada == Jogadas.TESOURA;
		}
		@Override
		public boolean perde(Jogadas jogada) {
			return jogada == Jogadas.PAPEL;
		}
	},
	
	PAPEL {
		@Override
		public boolean ganha(Jogadas jogada) {
			return jogada == Jogadas.PEDRA;
		}
		@Override
		public boolean perde(Jogadas jogada) {
			return jogada == Jogadas.TESOURA;
		}
	},
	
	TESOURA {
		@Override
		public boolean ganha(Jogadas jogada) {
			return jogada == Jogadas.PAPEL;
		}
		@Override
		public boolean perde(Jogadas jogada) {
			return jogada == Jogadas.PEDRA;
		}
	};
	
	public abstract boolean ganha(Jogadas jogada);
	public abstract boolean perde(Jogadas jogada);
	
}
