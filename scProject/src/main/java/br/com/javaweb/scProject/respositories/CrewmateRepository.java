package br.com.javaweb.scProject.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.javaweb.scProject.entities.Crewmate;

public interface CrewmateRepository extends JpaRepository<Crewmate, Long>  {

}
