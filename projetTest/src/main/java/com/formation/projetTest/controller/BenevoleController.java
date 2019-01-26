package com.formation.projetTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.formation.projetTest.dto.BenevoleListDto;
import com.formation.projetTest.persistence.entity.benevole.Benevole;
import com.formation.projetTest.persistence.repository.BenevoleRepository;
import com.formation.projetTest.service.impl.BenevoleService;

@RestController
@RequestMapping("/api/public/benevole")

public class BenevoleController {
	@Autowired
	BenevoleService benevoleService;
	
	@GetMapping
	@ResponseBody
	public List<BenevoleListDto> findAll() {
		return benevoleService.findAll();
	}

}
