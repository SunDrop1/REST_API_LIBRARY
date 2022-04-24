package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Livre;
import com.example.demo.repos.LivreRepo;

@Service
public class LivreService {

	@Autowired
	LivreRepo livreRepo;
	
	
	//Find All
	
	public List<Livre> findAll() {
		return livreRepo.findAllByOrderByIdAsc();
	}
	
	//Find by 
	 public Livre findByid(Integer id) {
		 return livreRepo.findByid(id);
	 }
	
	 
	//UPDATE BY ID
	public Livre updateLivre(Livre livreDetails , Integer id) {
			Livre l = livreRepo.findByid(id);
			if(l != null) {
				l.setAuteur(livreDetails.getAuteur());
				l.setDispo(livreDetails.isDispo());
				l.setDate_sortie(livreDetails.getDate_sortie());
				l.setNbr_page(livreDetails.getNbr_page());
				l.setTitre(livreDetails.getTitre());
			}
			return livreRepo.save(l);
	}	 
	
	//DELETE BY ID
	
	public String deleteLivre(Integer id) {
		if(livreRepo.findByid(id) != null)		
		{
			livreRepo.deleteByid(id);
			return "book"+id+" deleted !!";
		}
		return "book" + id + "was not found";
	}
	
	//DELETE ALL
	
	public void deleteAllBooks() {
		livreRepo.deleteAll();
	}
	
}
