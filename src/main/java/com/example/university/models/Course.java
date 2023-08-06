package com.example.university.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Course {
    @Id
    @GeneratedValue
    private Long id;
    @Setter
    @Getter
    private String identifier;
    @Setter
    @Getter
    private String title;
    @Getter
    @Setter
    private String teacher;

    public Course() {
    }


}