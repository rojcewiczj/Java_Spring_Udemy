package com.example.java_spring_udemy.repositories;

import com.example.java_spring_udemy.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
