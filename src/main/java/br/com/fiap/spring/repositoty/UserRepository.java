package br.com.fiap.spring.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.spring.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}