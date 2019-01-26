package com.formation.projetTest.service;

import java.util.List;

import com.formation.projetTest.dto.BenevoleDto;
import com.formation.projetTest.dto.BenevoleListDto;

public interface IBenevoleService {
	
	public List<BenevoleListDto> findAll();

}
