package com.example.university.dto;


import com.example.university.models.Lesson;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class CourseDTO {

    @Getter
    @Setter
    private String identifier;
    @Getter
    @Setter
    private String title;
    @Getter
    @Setter
    private String teacher;
    @Getter
    @Setter
    private List<Lesson> lessons = new ArrayList<>();
    private boolean isEnrolled;

    public CourseDTO() {
    }

    public boolean isEnrolled() {
        return isEnrolled;
    }

    public void setEnrolled(boolean enrolled) {
        isEnrolled = enrolled;
    }
}