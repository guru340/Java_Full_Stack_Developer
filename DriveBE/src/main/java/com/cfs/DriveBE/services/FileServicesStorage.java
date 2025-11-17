package com.cfs.DriveBE.services;

import com.cfs.DriveBE.Entity.FileEntity;
import com.cfs.DriveBE.repo.FileRepo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.ssl.SslProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;



@Service
public class FileServicesStorage {

    @Value("{file.upload-dir}")
    private String uploadDir;

    private final FileRepo fileRepo;

    public FileServicesStorage(FileRepo fileRepo) {
        this.fileRepo = fileRepo;
    }

    public String saveFile(MultipartFile file,Long parentFolderId) throws IOException {
        Path uplaodPath = Paths.get(uploadDir);
        if(!Files.exists(uplaodPath)){
            Files.createDirectories(uplaodPath);
        }
//        filename
        String filename=file.getOriginalFilename();
        Path filepath=uplaodPath.resolve(filename);
        Files.copy(file.getInputStream(),filepath, StandardCopyOption.REPLACE_EXISTING);

//        metadata For Db
        FileEntity fileEntity=new FileEntity();
        fileEntity.setName(filename);
        fileEntity.setPath(filepath.toString());
        fileEntity.setSize(file.getSize());
        fileEntity.setType("file");
        fileEntity.setParentFolderId(parentFolderId);
        fileEntity.setCreatedAt(LocalDateTime.now());

        fileRepo.save(fileEntity);
        return "File Uploaded";
    }

    public List<FileEntity> getFilesInFolder(Long parentFolderId) {
        if (parentFolderId == null) {
            return fileRepo.findAll()
                    .stream()
                    .filter(f -> f.getParentFolderId() == null)
                    .collect(Collectors.toList());
        } else {
            return fileRepo.findAll()
                    .stream()
                    .filter(f -> parentFolderId.equals(f.getParentFolderId()))
                    .collect(Collectors.toList());
        }
    }

    public FileEntity getFileById(Long Id) {
        return fileRepo.findById(Id).orElseThrow(()->new RuntimeException("Files not Found"));
    }

    public void deletebyId(Long id){
        fileRepo.deleteById(id);
    }

}
