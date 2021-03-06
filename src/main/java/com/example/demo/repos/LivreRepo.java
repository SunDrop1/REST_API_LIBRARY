package com.example.demo.repos;


import java.util.List;

import javax.persistence.OrderBy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Livre;



public interface LivreRepo extends JpaRepository<Livre,Integer>{
	
	
	List<Livre> findAllByOrderByIdAsc();
	
	Livre findByid(Integer id);
	
	List<Livre> deleteByid(Integer id);
	
	void deleteAll();
	
}
