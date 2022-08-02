package com.example.filesandfolders.filesHomework2.repositories;

import com.example.filesandfolders.filesHomework2.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
