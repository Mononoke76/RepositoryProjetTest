package com.formation.projetTest.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.formation.projetTest.persistence.entity.benevole.Benevole;

public class BenevoleListDto {
	

	private String nom;
	private String prenom;
	private String typeLibelleCourt;
	private List<CotisationDto> cotisations;
	private Integer montantCotisation;
	
	public BenevoleListDto(Benevole b) {
		this.setNom(b.getNom());
		this.setPrenom(b.getPrenom());
		this.setTypeLibelleCourt(b.getTypeBenevole().getLibelleCourt());
		this.setCotisations(b.getCotisations()
				.stream()
				.map(c-> new CotisationDto(c))
				.collect(Collectors.toList()));
		this.setMontantCotisation(b.getCotisations()
				.stream()
				.mapToInt(c-> new CotisationDto(c).getMontant())
				.sum());
		
		
		
		
		
	}
	
	
	public List<CotisationDto> getCotisations() {
		return cotisations;
	}


	public void setCotisations(List<CotisationDto> cotisations) {
		this.cotisations = cotisations;
	}


	public Integer getMontantCotisation() {
		return montantCotisation;
	}


	public void setMontantCotisation(Integer montantCotisation) {
		this.montantCotisation = montantCotisation;
	}


	public String getTypeLibelleCourt() {
		return typeLibelleCourt;
	}

	public void setTypeLibelleCourt(String typeLibelleCourt) {
		this.typeLibelleCourt = typeLibelleCourt;
	}

	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


}
