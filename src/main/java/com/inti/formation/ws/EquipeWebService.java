package com.inti.formation.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.formation.metier.IEquipeMetier;
import com.inti.formation.metier.IJoueurMetier;
import com.inti.formation.models.Equipe;

@RestController
@RequestMapping("/apiEquipes")
@CrossOrigin("*")
public class EquipeWebService {
	@Autowired
	private IEquipeMetier metier;
	@Autowired
	private IJoueurMetier metierjoueur;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public Equipe save(@RequestBody Equipe e ) {
		
		return metier.saveOrUpdate(e);
	}

	@RequestMapping(value="/update",method=RequestMethod.PUT)
	public Equipe  update (@RequestBody Equipe e ) {
		
		return metier.saveOrUpdate(e);
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	   

	public Equipe  getById(@PathVariable("id") int id) {
		
		return metier.getById(id);
	}


	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") int id) {

		metier.delete(id);
	}


	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public List <Equipe> findAll(){
		
		return metier.getAll();
	}
}
