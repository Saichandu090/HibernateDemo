package com.hibernate.first;

import jakarta.persistence.*;

//POJO class
@Entity
@Table(name = "Emp")
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USN",length = 23)
    private int empId;
    @Column(name = "NAME",length = 25)
    private String empName;
    @Column(name = "SALARY",length = 10)
    private double empSal;

    @Transient
    private int x;

    public int getEmpId()
    {
        return empId;
    }

    public void setEmpId(int empId)
    {
        this.empId = empId;
    }

    public String getEmpName()
    {
        return empName;
    }

    public void setEmpName(String empName)
    {
        this.empName = empName;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public double getEmpSal()
    {
        return empSal;
    }

    public void setEmpSal(double empSal)
    {
        this.empSal = empSal;
    }

    @Override
    public String toString() {
        return "Employee [" +
                "EmpId='" + empId + '\'' +
                ", EmpName='" + empName + '\'' +
                ", EmpSal=" + empSal +
                ", X=" + x +
                ']';
    }
}
