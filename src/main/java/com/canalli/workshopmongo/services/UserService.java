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
	public UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(String id){
		Optional<User> user = repository.findById(id);
		if(!user.isPresent()) {
			throw new ObjectNotFoundException("Objeto não encontrado.");
		}
		return user.get();
	}
	
	public User insert(User obj) {
		return repository.insert(obj);
	}
	
	public void delete(String id) {
		findById(id);
		
		repository.deleteById(id);
	}
	
	public User update(User obj) {
		User newObj = repository.findById(obj.getId()).get();
		
		updateData(newObj, obj);
		
		return repository.save(obj);
	}
	
	public void updateData(User newObj, User obj) {
		newObj.setName(obj.getName());
		newObj.setEmail(obj.getEmail());
	}
	
	
	public User fromDTO(UserDTO objDTO) {
		return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
	}

}
