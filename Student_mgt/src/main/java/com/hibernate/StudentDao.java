// Author Name : Renu Sharma

/*
 * 3.StudentDao

    insertStudent(Student st);
    Student getStudent(int id);
    boolean deleteStudent(int id);
    boolean updateStudent(int id);

 */

package com.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;



public class StudentDao {
	
	public static boolean insertStudent(Student stu) {


		try {
			Session session = HibernateUtil.getSession();
			Transaction t = session.beginTransaction();
			session.save(stu);
			t.commit();
			return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;

	}


public static Student getStudent(int id) {


	try {
		Session session = HibernateUtil.getSession();
		Transaction t = session.beginTransaction();
		Student stu = session.get(Student.class, id);
		session.getTransaction().commit();
		return stu;
	} catch (Exception e) {
		System.out.println(e);
	}
	return null;
	}

public static boolean deleteStudent(Student stud3,int id)
{
	try
	{
		Session session=HibernateUtil.getSession();
		session.beginTransaction();
		Student st=session.get(Student.class,id);
		session.delete(st);
		session.getTransaction().commit();
		return true;
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return false;
}
public static boolean updateStudent(Student stu4) {
	
		try
		{
			Session session=HibernateUtil.getSession();
			Transaction t=session.beginTransaction();
//			Student st=session.get(Student.class, id);
//			st.setSname(newName);
//			st.setContact(newContact);
			session.update(stu4);
			//session.update(st);
			t.commit();
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return false;
	}
}