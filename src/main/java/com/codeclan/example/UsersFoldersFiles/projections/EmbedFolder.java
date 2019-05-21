package com.codeclan.example.UsersFoldersFiles.projections;

import com.codeclan.example.UsersFoldersFiles.models.File;
import com.codeclan.example.UsersFoldersFiles.models.Folder;
import com.codeclan.example.UsersFoldersFiles.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name= "embedFolder", types = File.class)
public interface EmbedFolder {
    String getName();
    String getExtension();
    int getSize();
    Folder getFolder();
}
