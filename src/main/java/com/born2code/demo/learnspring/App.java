package com.born2code.demo.learnspring;

import java.util.List;

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
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/born2code/demo/learnspring/beans/beans.xml");
    	NoticesDAO noticesDao = (NoticesDAO) context.getBean("noticesDao");
    	List<Notice> notices = noticesDao.getNotices();
    	
    	for(Notice notice: notices){
    		System.out.println(notice);
    	}
    	
    	((ClassPathXmlApplicationContext) context).close();
    }
}
