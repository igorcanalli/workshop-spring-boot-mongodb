package com.canalli.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.canalli.workshopmongo.domain.User;
import com.canalli.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	public UserRepository repositorio;
	
	public List<User> findAll(){
		return repositorio.findAll();
	}

}
