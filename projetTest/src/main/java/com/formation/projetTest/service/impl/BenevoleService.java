package com.formation.projetTest.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.projetTest.dto.BenevoleDto;
import com.formation.projetTest.dto.BenevoleListDto;
import com.formation.projetTest.persistence.entity.benevole.Benevole;
import com.formation.projetTest.persistence.repository.BenevoleRepository;
import com.formation.projetTest.service.IBenevoleService;

@Service
public class BenevoleService implements IBenevoleService{
	
	@Autowired 
	BenevoleRepository benevoleRepo;

	@Override
	public List<BenevoleListDto> findAll() {
		List<Benevole> benevoles= benevoleRepo.findAll();
		
		List<BenevoleListDto> item = 
				benevoles
				.stream()
				.map(b-> new BenevoleListDto(b))
				.collect(Collectors.toList());
		
		// TODO Auto-generated method stub
		return item;
	}
	

}
