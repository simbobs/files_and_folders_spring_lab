package com.example.filesandfolders.filesHomework2.components;

import com.example.filesandfolders.filesHomework2.models.File;
import com.example.filesandfolders.filesHomework2.models.Folder;
import com.example.filesandfolders.filesHomework2.models.Person;
import com.example.filesandfolders.filesHomework2.repositories.FileRepository;
import com.example.filesandfolders.filesHomework2.repositories.FolderRepository;
import com.example.filesandfolders.filesHomework2.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){

        Person simona = new Person("Simona");
        personRepository.save(simona);

        Person lou = new Person("Louise");
        personRepository.save(lou);

        Folder myGraphics = new Folder("Graphics", lou);
        folderRepository.save(myGraphics);

        Folder myLanguages = new Folder("Languages", simona);
        folderRepository.save(myLanguages);

        File spanish = new File("spanish basics", ".doc", 0.4, myLanguages);
        fileRepository.save(spanish);

        File photoshop = new File("photoshop edits", ".px", 3.4, myGraphics);
        fileRepository.save(photoshop);

    }
}
