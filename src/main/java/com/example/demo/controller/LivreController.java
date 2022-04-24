package com.example.demo.controller;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.LivreService;
import com.example.demo.entities.Livre;
@RestController
public class LivreController {

	@Autowired
	private LivreService service;
	
	
	@GetMapping("/emsi_api/livres")
	public List<Livre> findAllLivre(){
		return service.findAll();
	}
	
	@GetMapping("/emsi_api/livres/{id}")
	public Livre findById(@PathVariable int id) {
		
		Livre l = service.findByid(id);
		Date now = new Date(System.currentTimeMillis());
		l.setLast_consult(now);
		return service.findByid(id);
	}
	
	
	@PutMapping("/emsi_api/update/{id}")
	public Livre updateLivre(@PathVariable int id, @RequestBody Livre livre) {
		return service.updateLivre(livre, id);
	}
	
	@Transactional
	@DeleteMapping("/emsi_api/delete/{id}") 	
	public String  deleteLivre(@PathVariable int id) {
		return service.deleteLivre(id);
	}
	
	@Transactional
	@DeleteMapping("/emsi_api/delete") 	
	public void deleteAllBooks(){
		service.deleteAllBooks();
		System.out.println("all books are deleted");
	}

	
	
}
