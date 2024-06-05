package com.daraganesha.keep_backend.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Item implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    @Column(nullable = false, updatable = false)
    private String itemCode;

    public Item(){
    }

    public Item(String title, String description, String itemCode) {
        this.description = description;
        this.title = title;
        this.itemCode = itemCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", title=" + title + ", description=" + description + "}";
    }

}
