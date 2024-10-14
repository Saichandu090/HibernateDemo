package com.hibernate.first;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student
{
    @Id
    private int usn;
    private String name;
    private double marks;

    public Student(int usn, String name, double marks)
    {
        this.usn = usn;
        this.name = name;
        this.marks = marks;
    }

    public int getUsn() {
        return usn;
    }

    public void setUsn(int usn) {
        this.usn = usn;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Student [" +
                "Usn=" + usn +
                ", Name='" + name + '\'' +
                ", Marks=" + marks +
                ']';
    }
}
