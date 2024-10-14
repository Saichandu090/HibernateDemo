package com.hibernate.first;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//DAO class --Data Access Object
public class App
{
    public static void main(String[] args)
    {
        //Student student=new Student(1,"Jenisha",93.7);

//        Employee employee=new Employee();
//        employee.setEmpName("Manish");
//        employee.setEmpSal(367872.98);
//        employee.setX(1);

        Configuration configuration= new Configuration();
        configuration.configure("hibernate.cfg.xml");

        SessionFactory buildSessionFactory=configuration.buildSessionFactory();
        Session session=buildSessionFactory.openSession();

        //Transaction transaction=session.beginTransaction();
        //session.save(employee);
        //transaction.commit();

//        Employee emp=session.get(Employee.class,2);
//        System.out.println(emp);
//        Employee emp2=session.get(Employee.class,2);
//        System.out.println(emp2);

//        Employee employee=session.load(Employee.class,2);
//        System.out.println(employee);
//        Employee employee2=session.load(Employee.class,4);
//        System.out.println(employee2);

        session.close();
        buildSessionFactory.close();

    }
}
