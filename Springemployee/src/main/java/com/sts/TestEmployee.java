package com.sts;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        
        Employee employee = (Employee) context.getBean("empObj3", Employee.class);
        System.out.println("id :"+employee.getId());
        System.out.println("name :"+employee.getName());
        System.out.println("salary :"+employee.getSalary());
        employee.show();

        

    }
}


