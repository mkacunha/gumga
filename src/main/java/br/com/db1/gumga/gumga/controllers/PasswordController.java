package br.com.db1.gumga.gumga.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.db1.gumga.gumga.domain.Password;
import br.com.db1.gumga.gumga.repositories.PasswordRepository;
import br.com.db1.gumga.gumga.services.AvaliadorService;

@RestController
@RequestMapping("api/passwords")
@CrossOrigin(origins = "*")
public class PasswordController {

	@Autowired
	private PasswordRepository passwordRepository;

	@Autowired
	private AvaliadorService avaliadorService;

	@GetMapping
	public Iterable<Password> listPasswords() {

		return passwordRepository.findAll();

	}

	@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public Iterable<Password> salva(@Valid @RequestBody Password password) {

		avaliadorService.postOrUpdate(password);

		return listPasswords();

	}

}
