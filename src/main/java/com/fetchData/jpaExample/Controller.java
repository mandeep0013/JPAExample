package com.fetchData.jpaExample;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Controller{
	
	@Autowired
	FetchDataService fetchDataService;
	@GetMapping(path = "getdata") 
	List<UserModel> getUser(){
		return fetchDataService.findAll();
		
	}
	
}
	

