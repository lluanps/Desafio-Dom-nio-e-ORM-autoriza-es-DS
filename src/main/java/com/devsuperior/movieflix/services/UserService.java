package com.devsuperior.movieflix.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.movieflix.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;

	
}
