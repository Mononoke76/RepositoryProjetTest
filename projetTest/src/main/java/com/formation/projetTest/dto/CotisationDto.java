package com.formation.projetTest.dto;

import java.util.Date;


import com.formation.projetTest.persistence.entity.benevole.Cotisation;

public class CotisationDto {
	
	private Date dateCotisation;
	private Integer montant;
	
	public CotisationDto(Cotisation c) {
		this.setDateCotisation(c.getDateCotisation());
		this.setMontant(c.getMontant());
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
	

}
