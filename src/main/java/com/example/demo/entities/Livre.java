package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.LastModifiedDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class Livre {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column(length = 50,nullable = false)
	private String titre;
	
	@Column(nullable = false)
	private String maison_ed;
	
	@Temporal(value=TemporalType.DATE)
    @Column(nullable = false)
	private Date date_sortie;
	
	@Column(nullable = false)
	private String auteur;
	
	@Column(nullable = false)
	private Integer nbr_page;
	
	@Column(unique = true,nullable = false)
	private String isbn;
	
	
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date last_consult;
	
	
	@Column(nullable = false)
	private boolean dispo;


	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getMaison_ed() {
		return maison_ed;
	}


	public void setMaison_ed(String maison_ed) {
		this.maison_ed = maison_ed;
	}


	public Date getDate_sortie() {
		return date_sortie;
	}


	public void setDate_sortie(Date date_sortie) {
		this.date_sortie = date_sortie;
	}


	public String getAuteur() {
		return auteur;
	}


	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}


	public Integer getNbr_page() {
		return nbr_page;
	}


	public void setNbr_page(Integer nbr_page) {
		this.nbr_page = nbr_page;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}



	public Date getLast_consult() {
		return last_consult;
	}


	public void setLast_consult(Date last_consult) {
		this.last_consult = last_consult;
	}


	public boolean isDispo() {
		return dispo;
	}


	public void setDispo(boolean dispo) {
		this.dispo = dispo;
	}
	
	

}
