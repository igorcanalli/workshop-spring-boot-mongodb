package com.canalli.workshopmongo.repository;

import org.springframework.stereotype.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.canalli.workshopmongo.domain.Post;
import com.canalli.workshopmongo.domain.User;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
