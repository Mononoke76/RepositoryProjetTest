package com.formation.projetTest.persistence.entity.benevole;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cotisation")
public class Cotisation {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID", unique=true, nullable=false)
	private Long id;
	
	@Column(name="DateCotisation", nullable=false)
	private Date dateCotisation;
	
	@Column(name="Montant", nullable=false)
	private Integer montant;
	@Column(name="Details", length=50)
	private String details;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateCotisation() {
		return dateCotisation;
	}
	public void setDateCotisation(Date dateCotisation) {
		this.dateCotisation = dateCotisation;
	}
	public Integer getMontant() {
		return montant;
	}
	public void setMontant(Integer montant) {
		this.montant = montant;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	

}
