package com.canalli.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.canalli.workshopmongo.domain.User;
import com.canalli.workshopmongo.dto.UserDTO;
import com.canalli.workshopmongo.repository.UserRepository;
import com.canalli.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	public UserRepository repositorio;
	
	public List<User> findAll(){
		return repositorio.findAll();
	}
	
	public User findById(String id){
		Optional<User> user = repositorio.findById(id);
		if(!user.isPresent()) {
			throw new ObjectNotFoundException("Objeto não encontrado.");
		}
		return user.get();
	}
	
	public User insert(User obj) {
		return repositorio.insert(obj);
	}
	
	public User fromDTO(UserDTO objDTO) {
		return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
	}

}
