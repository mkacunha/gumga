package br.com.db1.gumga.gumga.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Password {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;

	protected String password;
	protected Integer nivel = 0;

	public Password() {

	}

	public Password(Integer id, String password) {
		super();
		this.id = id;
		this.password = password;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {

		this.password = password;
	}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

}
