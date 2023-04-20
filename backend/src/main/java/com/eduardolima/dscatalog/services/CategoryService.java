package com.eduardolima.dscatalog.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eduardolima.dscatalog.dto.CategoryDTO;
import com.eduardolima.dscatalog.entities.Category;
import com.eduardolima.dscatalog.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	@Transactional(readOnly = true)
	public List<CategoryDTO> findAll(){
		List<Category> list = repository.findAll();
		
/* Uma das formas de resolver */
	
//		List<CategoryDTO> listDto = new ArrayList<>();
//		for (Category cat : list) {
//			listDto.add(new CategoryDTO(cat));
//		}
		
//		return list.Dto;
		
/* Forma mais senior de se resolver */
		
//		List<CategoryDTO> listDto = list
//				.stream()
//				.map(x -> new CategoryDTO(x))
//				.collect(Collectors.toList());
//		
//		return listDto;
		
/* Forma ainda mais senior de se resolver */
		
		return list
				.stream()
				.map(x -> new CategoryDTO(x))
				.collect(Collectors.toList());
	}

}
