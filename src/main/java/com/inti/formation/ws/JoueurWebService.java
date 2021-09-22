package com.inti.formation.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.formation.metier.IJoueurMetier;
import com.inti.formation.models.Joueur;

@RestController
@RequestMapping("/apiJoueurs")
  @CrossOrigin("*")
public class JoueurWebService {
	@Autowired
	private IJoueurMetier metier;
	 
 
	 @RequestMapping(value = "/save", method = RequestMethod.POST)
		public Joueur save(@RequestBody Joueur j) {
			
			return metier.saveOrUpdate(j);
		}
	 
	 
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	public Joueur update (@RequestBody Joueur j) {
		
		return metier.saveOrUpdate(j);
	}
	
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
       
	
	public Joueur getById(@PathVariable("id") int id) {
		
		return metier.getById(id);
	}
	
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") int id) {

		metier.delete(id);
	}
	
	 
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public List<Joueur> findAll() {

		return metier.getAll();
	}
}
