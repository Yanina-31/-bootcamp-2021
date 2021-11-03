package com.company;

import java.util.*;


public class Course {

    private String name;
    private int hours;
    private ArrayList<Student> studentList;

    // el constructor inicializa los valores de los objetos de la clase
    public Course(String name, int hours, ArrayList<Student> studentList){
        this.name = name;
        this.hours = hours;
        this.studentList = studentList;
    }

    //mostrar datos del curso

    @Override
    public String toString(){
        return new String("Name: "+this.name+", Hours: "+this.hours+", Students List: "+this.studentList);
    }

    public ArrayList<Student> listStudentAverageHigher6()
    {
        ArrayList<Student> listStudent=new ArrayList<Student>();
        for (int i=0; i<this.studentList.size(); i++)
        {
            if(this.studentList.get(i).average()>6)
            {
                listStudent.add(studentList.get(i));
            }

        }
        return listStudent;

    }

    public ArrayList<Student> listStudentOrderByNameAndSurname()
    {
        Comparator<Student> compareBySurnameAndName = (Student o1, Student o2) -> o1.getSurnameAndName().compareTo( o2.getSurnameAndName() );

        Collections.sort(this.studentList, compareBySurnameAndName);

        return this.studentList;
    }


    public void toJson()
    {
        //JSONObject nuevo=new JSONObject();
    }


}