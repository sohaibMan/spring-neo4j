package com.example.university.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.Node;


public class CourseEnrolment {
    @Setter
    private User user;
    @Setter
    @Getter
    private Course course;

    public CourseEnrolment() {
    }


}
