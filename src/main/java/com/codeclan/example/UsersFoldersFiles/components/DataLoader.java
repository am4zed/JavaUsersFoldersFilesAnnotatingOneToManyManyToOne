package com.codeclan.example.UsersFoldersFiles.components;

import com.codeclan.example.UsersFoldersFiles.models.File;
import com.codeclan.example.UsersFoldersFiles.models.Folder;
import com.codeclan.example.UsersFoldersFiles.models.User;
import com.codeclan.example.UsersFoldersFiles.repositories.FileRepository;
import com.codeclan.example.UsersFoldersFiles.repositories.FolderRepository;
import com.codeclan.example.UsersFoldersFiles.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;



@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        User jeremy = new User("Jeremy");
        userRepository.save(jeremy);

        Folder folder1 = new Folder("Project", jeremy);
        folderRepository.save(folder1);

        File file1 = new File("Intro", "txt", 50, folder1);
        fileRepository.save(file1);
    }
}
