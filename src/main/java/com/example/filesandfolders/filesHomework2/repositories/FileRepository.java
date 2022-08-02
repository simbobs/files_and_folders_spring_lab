package com.example.filesandfolders.filesHomework2.repositories;

import com.example.filesandfolders.filesHomework2.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
