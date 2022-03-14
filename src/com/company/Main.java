package com.company;

public class Main {

    public static void main(String[] args) {

        CourseManager courseManager = new CourseManager();
        for (Course course:courseManager.GetAll()
             ) {
            courseManager.Add(course);
            courseManager.Update(course);
            courseManager.Remove(course);
        }

        InstructorManager instructorManager = new InstructorManager();
        for (Instructor instructor:instructorManager.GetAll()
             ) {
            instructorManager.Add(instructor);
            instructorManager.Update(instructor);
            instructorManager.Remove(instructor);

        }

    }
}
