package com.company;

public class CourseManager {
    public void Add(Course course){
        System.out.println(course.detail + " Eklendi.");
    }

    public void Update(Course course){
        System.out.println(course.detail + " Güncellendi. ");
    }

    public void Remove(Course course){
        System.out.println(course.detail + " Silindi.");
    }

    public Course[] GetAll(){
        Course course1 = new Course(1,50,"Java Sertification Course", 1);
        Course course2 = new Course(2, 50, "Web Sertification Course", 2);
        Course[] courses = {course1, course2};
        return courses;
    }
}
