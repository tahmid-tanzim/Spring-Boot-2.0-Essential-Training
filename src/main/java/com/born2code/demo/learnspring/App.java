package com.born2code.demo.learnspring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/born2code/demo/learnspring/beans/beans.xml");
		NoticesDAO noticesDao = (NoticesDAO) context.getBean("noticesDao");
		List<Notice> notices = noticesDao.getNotices();

		try {
			for (Notice notice : notices) {
				System.out.println(notice);
			}
			
			Notice notice = noticesDao.getNotice(6);
			System.out.println("Notice ID: 6 -- " + notice);
		} catch (CannotGetJdbcConnectionException ex) {
			System.out.println("Could not get JDBC connection.");
		} catch (DataAccessException ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.getClass());
		}

		((ClassPathXmlApplicationContext) context).close();
	}
}
