package com.example.university.requests;

import lombok.Getter;
import lombok.Setter;

public class CourseEnrolmentRequest {

    @Getter
    @Setter
    private String courseIdentifier;

    public CourseEnrolmentRequest() {
    }

}