package com.company;

public class Course {
    public Course(int id, int unitPrice, String detail, int InstructorId) {
        this.id = id;
        this.unitPrice = unitPrice;
        this.detail = detail;
        this.InstructorId = InstructorId;
    }
    int id;
    int unitPrice;
    String detail;
    int InstructorId;
}
