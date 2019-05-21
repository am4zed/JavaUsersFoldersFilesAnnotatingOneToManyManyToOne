package com.codeclan.example.UsersFoldersFiles.repositories;

import com.codeclan.example.UsersFoldersFiles.models.Folder;
import com.codeclan.example.UsersFoldersFiles.models.User;
import com.codeclan.example.UsersFoldersFiles.projections.EmbedUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedUser.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
