package com.hibernate.SpringProject1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac=new ClassPathXmlApplicationContext("com/hibernate/SpringProject1/applicationcontext.xml");
        Student st=(Student)ac.getBean("studentbean1");
        System.out.println(st+"\n");
        Student st1=(Student)ac.getBean("studentbean2");
        System.out.println(st1);
    
    }
}
