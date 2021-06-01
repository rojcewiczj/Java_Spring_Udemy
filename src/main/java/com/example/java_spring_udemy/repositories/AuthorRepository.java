package com.example.java_spring_udemy.repositories;

import com.example.java_spring_udemy.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
