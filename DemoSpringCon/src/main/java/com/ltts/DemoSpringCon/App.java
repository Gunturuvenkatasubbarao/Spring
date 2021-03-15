package com.ltts.DemoSpringCon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("cons.xml");
        Employe e=(Employe)context.getBean("emp");
    Employe e1=(Employe)context.getBean("emp1");
    Employe e2=(Employe)context.getBean("emp2");
        System.out.println(e);
        System.out.println(e1);
        System.out.println(e2);
      
    }
}
