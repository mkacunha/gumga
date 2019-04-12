package br.com.db1.gumga.gumga.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.db1.gumga.gumga.domain.Password;

@Repository
public interface PasswordRepository extends JpaRepository<Password, Integer> {

}
