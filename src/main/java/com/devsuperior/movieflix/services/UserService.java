package com.devsuperior.movieflix.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.movieflix.dto.UserDTO;
import com.devsuperior.movieflix.entitites.User;
import com.devsuperior.movieflix.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	@Autowired
	private AuthService authService;
	
	@Transactional(readOnly = true)
	public UserDTO currentUserProfile() {
		
		User user = authService.authentificated();
		return new UserDTO(user);
	}
	

	
}
