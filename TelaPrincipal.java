package br.com.Cod3r.cm.visao;

import javax.swing.JFrame;

import br.com.Cod3r.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {

	public TelaPrincipal() {
		Tabuleiro tabuleiro = new Tabuleiro(16, 30, 30);
		add(new PainelTabueiro(tabuleiro));

		setTitle("Campo minado");
		setVisible(true);
		setSize(690, 438);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) {

		new TelaPrincipal();
	}
}
