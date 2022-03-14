package com.company;

public class InstructorManager {
    public void Add(Instructor instructor){
        System.out.println(instructor.name + " Eklendi.");
    }

    public void Update(Instructor instructor){
        System.out.println(instructor.name + " Güncellendi.");
    }

    public void Remove(Instructor instructor){
        System.out.println(instructor.name + " Silindi.");
    }

    public Instructor[] GetAll(){
        Instructor instructor1 = new Instructor(1, "Engin Demiroğ", "Microsoft Certified Trainer (MCT) ,PMP ve ITIL sertifikalarına sahibim.");
        Instructor instructor2 = new Instructor(2, "Samet Solaklar", "Microsoft Certified Trainer (MCT) ,PMP ve ITIL sertifikalarına sahibim.");
        Instructor[] instructors = {instructor1, instructor2};
        return instructors;
    }
}
