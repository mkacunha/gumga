package br.com.db1.gumga.gumga.domain;

import org.springframework.stereotype.Service;

import br.com.db1.gumga.gumga.interfaces.Avaliador;

@Service
public class AvaliaMinusculas implements Avaliador {

	@Override
	public void avaliaPassword(Password password) {
		if (password.password.contains("a") || password.password.contains("b") || password.password.contains("c")
				|| password.password.contains("d") || password.password.contains("e") || password.password.contains("f")
				|| password.password.contains("g") || password.password.contains("h") || password.password.contains("i")
				|| password.password.contains("j") || password.password.contains("k") || password.password.contains("l")
				|| password.password.contains("m") || password.password.contains("n") || password.password.contains("o")
				|| password.password.contains("p") || password.password.contains("q") || password.password.contains("r")
				|| password.password.contains("s") || password.password.contains("t") || password.password.contains("u")
				|| password.password.contains("v") || password.password.contains("w") || password.password.contains("x")
				|| password.password.contains("y") || password.password.contains("z")) {
			password.nivel += 20;

		}

	}
}
