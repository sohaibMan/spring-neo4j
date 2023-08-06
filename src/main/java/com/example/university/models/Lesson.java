package com.example.university.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Lesson {
    @Id
    @GeneratedValue
    private Long id;
    @Getter
    @Setter
    private String identifier;
    @Getter
    @Setter
    private String title;

    public Lesson() {
    }


}