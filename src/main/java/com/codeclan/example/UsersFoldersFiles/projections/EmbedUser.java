package com.codeclan.example.UsersFoldersFiles.projections;

import com.codeclan.example.UsersFoldersFiles.models.Folder;
import com.codeclan.example.UsersFoldersFiles.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name= "embedUser", types = Folder.class)
public interface EmbedUser {
    String getTitle();
    List getFiles();
    User getUser();
}
