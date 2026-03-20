package com.example.Phan_Xuan_Anh_Tai.model;

import jakarta.persistence.*;

@Entity
@Table(name = "projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String link;

    // --- Tự viết Getter và Setter thủ công ---
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getLink() { return link; }
    public void setLink(String link) { this.link = link; }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
}