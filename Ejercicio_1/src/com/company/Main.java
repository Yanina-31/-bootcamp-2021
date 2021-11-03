package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int[] note1={10,7,8};
        int[] note2={10,8,9};
        int[] note3={10,6,5};

        Student student = new Student("Yanina", "Piredda", 34,note1);
        Student student1 = new Student("Mauricio", "Torrilla", 34, note2);
        Student student2 = new Student("Facundo", "Gomez", 32, note3 );

        ArrayList<Student> listStudent=new ArrayList<Student>();
        listStudent.add(student);
        listStudent.add(student1);
        listStudent.add(student2);

        Course course1 = new Course("java", 30, listStudent);


    }
}
