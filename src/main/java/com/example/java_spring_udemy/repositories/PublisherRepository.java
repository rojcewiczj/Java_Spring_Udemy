package com.example.java_spring_udemy.repositories;

import com.example.java_spring_udemy.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
