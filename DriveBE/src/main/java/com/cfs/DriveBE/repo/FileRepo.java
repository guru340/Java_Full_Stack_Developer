package com.cfs.DriveBE.repo;

import com.cfs.DriveBE.Entity.FileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepo extends JpaRepository<FileEntity, Long> {


}
