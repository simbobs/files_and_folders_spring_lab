package com.example.filesandfolders.filesHomework2;

import com.example.filesandfolders.filesHomework2.models.File;
import com.example.filesandfolders.filesHomework2.models.Folder;
import com.example.filesandfolders.filesHomework2.models.Person;
import com.example.filesandfolders.filesHomework2.repositories.FileRepository;
import com.example.filesandfolders.filesHomework2.repositories.FolderRepository;
import com.example.filesandfolders.filesHomework2.repositories.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class FilesHomework2ApplicationTests {

	@Autowired
	PersonRepository personRepository;

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void canAddPerson(){
		Person lou = new Person("Louise");
		personRepository.save(lou);

	}

	@Test
	void canAddFile(){
		Person lou = new Person("Louise");
		personRepository.save(lou);
		Folder folder1 = new Folder("codeclan", lou);
		folderRepository.save(folder1);
		File file1 = new File("homework", ".doc", 0.1, folder1);
		fileRepository.save(file1);

	}

	@Test
	void canAddFolder(){
		Person lou = new Person("Louise");
		personRepository.save(lou);
		Folder folder1 = new Folder("codeclan", lou);
		folderRepository.save(folder1);
	}

}
