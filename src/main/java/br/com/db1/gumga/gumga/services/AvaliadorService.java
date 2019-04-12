package br.com.db1.gumga.gumga.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.db1.gumga.gumga.domain.AvaliaCaracteres;
import br.com.db1.gumga.gumga.domain.AvaliaMaiusculas;
import br.com.db1.gumga.gumga.domain.AvaliaMinusculas;
import br.com.db1.gumga.gumga.domain.AvaliaNumeros;
import br.com.db1.gumga.gumga.domain.AvaliaTamanho;
import br.com.db1.gumga.gumga.domain.Password;
import br.com.db1.gumga.gumga.repositories.PasswordRepository;

@Service
public class AvaliadorService {

	@Autowired
	private PasswordRepository passwordRepository;

	@Autowired
	private AvaliaCaracteres avaliaCaracteres;

	@Autowired
	private AvaliaMaiusculas avaliaMaiusculas;

	@Autowired
	private AvaliaTamanho avaliaTamanho;

	@Autowired
	private AvaliaMinusculas avaliaMinusculas;

	@Autowired
	private AvaliaNumeros avaliaNumeros;

	public Password postOrUpdate(Password password) {

		this.avaliaCaracteres.avaliaPassword(password);
		this.avaliaMaiusculas.avaliaPassword(password);
		this.avaliaTamanho.avaliaPassword(password);
		this.avaliaMinusculas.avaliaPassword(password);
		this.avaliaNumeros.avaliaPassword(password);

		if (password.getNivel() >= 80) {
			this.passwordRepository.save(password);
		}

		return password;

	}

}
