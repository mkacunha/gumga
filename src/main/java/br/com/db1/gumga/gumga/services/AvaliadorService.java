package br.com.db1.gumga.gumga.services;

import br.com.db1.gumga.gumga.domain.Password;
import br.com.db1.gumga.gumga.interfaces.Avaliador;
import br.com.db1.gumga.gumga.repositories.PasswordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliadorService {

    @Autowired
    private PasswordRepository passwordRepository;

    @Autowired
    private List<Avaliador> avaliadores;

    public Password postOrUpdate(Password password) {
        this.avaliadores.forEach(avaliador -> avaliador.avaliaPassword(password));

        if (password.getNivel() >= 80) {
            this.passwordRepository.save(password);
        }

        return password;
    }

}
