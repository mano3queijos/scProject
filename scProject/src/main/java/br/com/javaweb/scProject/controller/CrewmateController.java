package br.com.javaweb.scProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.javaweb.scProject.entities.Crewmate;
import br.com.javaweb.scProject.respositories.CrewmateRepository;

@Controller
@RequestMapping("/crewmates")
public class CrewmateController {

	@Autowired
	private CrewmateRepository crewmateRepository;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public @ResponseBody String inicio() {
		return "controller crewmates";
	}

	@PostMapping("/create")
	public String createCrewmate(@RequestParam("email") String email, @RequestParam("name") String name,
			@RequestParam("birthdayDate") String birthdayDate, @RequestParam("password") String password) {
		Crewmate crewmate = new Crewmate(name, email, password, birthdayDate);
		crewmateRepository.save(crewmate);

		// Redirecionar para uma página de sucesso ou outra ação necessária
		return "redirect:/crewmates";
	}
}
