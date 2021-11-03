package com.company;

public class Student {

    private String name;
    private String surname;
    private int age;
    private int[] notesList;

    // el constructor inicializa los valores de los objetos de la clase
    public Student(String name, String surname, int age, int[] notesList){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.notesList = notesList;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public String getSurnameAndName(){
        String s = this.getSurname() + " " + this.getName();
        return s;
    }

    public double average()
    {
        int sum=0;

        for (int i=0; i<this.notesList.length; i++)
        {
            sum=sum+this.notesList[i];
        }
        return sum/this.notesList.length;
    }



}