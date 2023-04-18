package com.bug_tracker.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String name;

    @ManyToMany
    private List<Ticket> tickets;

    @ManyToMany
    private List<Project> projects;

    @ManyToMany
    private List<Company> companies;
}
