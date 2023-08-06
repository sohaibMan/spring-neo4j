package com.example.university.queryresults;


import com.example.university.models.Course;
import com.example.university.models.User;
import lombok.Getter;
import lombok.Setter;

public class CourseEnrolmentQueryResult {

    @Getter
    @Setter
    private User user;
    @Getter
    @Setter
    private Course course;

    public CourseEnrolmentQueryResult() {
    }


}