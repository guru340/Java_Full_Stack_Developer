package com.cfs.DriveBE.Controller;

import com.cfs.DriveBE.Entity.FileEntity;
import com.cfs.DriveBE.services.FileServicesStorage;

import org.hibernate.annotations.Parent;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RestController
@RequestMapping("/api/files")
@CrossOrigin(origins = "http://localhost:3000")
public class FileController {
    private final FileServicesStorage  fileServicesStorage;

    public FileController(FileServicesStorage fileServicesStorage) {
        this.fileServicesStorage = fileServicesStorage;
    }

    @PostMapping("/upload")
    public ResponseEntity<String> uploadfile(@RequestParam("file") MultipartFile file,
                                             @RequestParam(value="parentFolderId",required = false) Long parentFolderId){
        try{
            String response=fileServicesStorage.saveFile(file,parentFolderId);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("File Upload Failed");
        }
    }
@GetMapping("/download/{id}")
    public ResponseEntity<Resource> downloadFile(@PathVariable Long id){

        try{
            FileEntity fileEntity=fileServicesStorage.getFileById(id);
            Path path= Paths.get(fileEntity.getPath());
            Resource resource=new UrlResource(path.toUri());
            return ResponseEntity.ok().header("Content-Disposition","attachment;filename=\""+fileEntity.getName()+"\"").body(resource);
        }catch (Exception e){
            return ResponseEntity.status(404).build();
        }
    }

    @GetMapping("/list")
    public ResponseEntity<List<FileEntity>> Listfiles(@RequestParam(value="parentFolderId",required = false) Long parentFolderId){
        List<FileEntity> files;
        if (parentFolderId==null){
            files=fileServicesStorage.getFilesInFolder(null);
        }
        else{
            files=fileServicesStorage.getFilesInFolder(parentFolderId);
        }
        return ResponseEntity.ok(files);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteFile(@PathVariable Long id){

        try{
//            will make path from mysql
            FileEntity fileEntity=fileServicesStorage.getFileById(id);

//            will make path and delete  from disk
            Path path= Paths.get(fileEntity.getPath());
            Files.deleteIfExists(path);
            fileServicesStorage.deletebyId(id);
            return ResponseEntity.ok("File deleted");
        }
        catch (Exception e){
            return ResponseEntity.status(500).body("Failed to delete file");
        }
    }
}
