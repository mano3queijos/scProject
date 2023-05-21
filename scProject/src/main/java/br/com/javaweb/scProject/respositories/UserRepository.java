package br.com.javaweb.scProject.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.javaweb.scProject.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {

}
