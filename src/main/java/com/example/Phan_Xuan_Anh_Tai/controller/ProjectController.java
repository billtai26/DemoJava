package com.example.Phan_Xuan_Anh_Tai.controller;

import com.example.Phan_Xuan_Anh_Tai.model.Project;
import com.example.Phan_Xuan_Anh_Tai.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
@CrossOrigin("*") // Cho phép Frontend gọi API
public class ProjectController {
    @Autowired
    private ProjectRepository repository;

    @GetMapping //READ
    public List<Project> getAll() {
        return repository.findAll();
    }

    @PostMapping // CREATE
    public Project create(@RequestBody Project project) {
        return repository.save(project);
    }

    @PutMapping("/{id}") //UPDATE
    public Project update(@PathVariable Long id, @RequestBody Project details) {
        Project p = repository.findById(id).orElseThrow();
        p.setName(details.getName());
        p.setDescription(details.getDescription());
        p.setLink(details.getLink());
        return repository.save(p);
    }

    @DeleteMapping("/{id}") // DELETE
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
