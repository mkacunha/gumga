package br.com.db1.gumga.gumga.domain;

import org.springframework.stereotype.Service;

import br.com.db1.gumga.gumga.interfaces.Avaliador;

@Service
public class AvaliaCaracteres implements Avaliador {

	@Override
	public void avaliaPassword(Password password) {
		if (password.password.contains("*") || password.getPassword().contains("@") || password.password.contains("#")
				|| password.password.contains("&")) {
			password.nivel += 20;
		}

	}

}
