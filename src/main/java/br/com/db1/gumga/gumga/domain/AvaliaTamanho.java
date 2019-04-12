package br.com.db1.gumga.gumga.domain;

import org.springframework.stereotype.Service;

import br.com.db1.gumga.gumga.interfaces.Avaliador;

@Service
public class AvaliaTamanho implements Avaliador {

	@Override
	public void avaliaPassword(Password password) {
		if (password.getPassword().length() >= 8)
			password.nivel += 20;

	}

}
