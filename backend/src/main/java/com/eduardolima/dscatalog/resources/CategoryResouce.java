package com.eduardolima.dscatalog.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduardolima.dscatalog.entities.Category;


@RestController
@RequestMapping(value = "/categories")
public class CategoryResouce {
	
	@Autowired
	private Category service;
	
	@GetMapping
	public ResponseEntity<java.util.List<Category>> findAll() {
		List<Category> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
		
	}

}
