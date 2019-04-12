package br.com.db1.gumga.gumga.domain;

import org.springframework.stereotype.Service;

import br.com.db1.gumga.gumga.interfaces.Avaliador;

@Service
public class AvaliaMaiusculas implements Avaliador {

	@Override
	public void avaliaPassword(Password password) {
		if (password.password.contains("A") || password.password.contains("B") || password.password.contains("C")
				|| password.password.contains("A") || password.password.contains("B") || password.password.contains("C")
				|| password.password.contains("D") || password.password.contains("E") || password.password.contains("F")
				|| password.password.contains("G") || password.password.contains("H") || password.password.contains("I")
				|| password.password.contains("J") || password.password.contains("K") || password.password.contains("L")
				|| password.password.contains("M") || password.password.contains("N") || password.password.contains("O")
				|| password.password.contains("P") || password.password.contains("Q") || password.password.contains("R")
				|| password.password.contains("S") || password.password.contains("T") || password.password.contains("U")
				|| password.password.contains("V") || password.password.contains("W") || password.password.contains("X")
				|| password.password.contains("Y") || password.password.contains("Z")) {
			password.nivel += 20;
		}

	}

}
