package br.com.db1.gumga.gumga.domain;

import org.springframework.stereotype.Service;

import br.com.db1.gumga.gumga.interfaces.Avaliador;

@Service
public class AvaliaNumeros implements Avaliador {

	@Override
	public void avaliaPassword(Password password) {
		if (password.password.contains("1") || password.password.contains("2") || password.password.contains("3")
				|| password.password.contains("4") || password.password.contains("5") || password.password.contains("6")
				|| password.password.contains("7") || password.password.contains("8") || password.password.contains("9")
				|| password.password.contains("0")) {
			password.nivel += 20;

		}

	}

}
