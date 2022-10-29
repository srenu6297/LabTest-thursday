// Author Name : Renu Sharma

/*
  4.App 

  Menu---1. Add Student   
         2. See Student detail  
         3. Delete a student
         4. Update student details
         9. Exit

 */

package com.hibernate;

import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{

	public static void main(String[] args) {
		boolean flag1 = true;
		while (flag1) {
			System.out.println("\npress 1 to Insert Student");
			System.out.println("press 2 to See Student details");
			System.out.println("press 3 to Delete Student details");
			System.out.println("press 4 to Update ");
			System.out.println("press 9 to Exit \n");

			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			boolean flag;

			switch (i) {
			case 1: {
				Student stu = new Student();
				System.out.println("....Enter Student Details which you want to insert..... : ");
				System.out.println("Enter student name : ");
				String sname = sc.next();
				stu.setSname(sname);
				System.out.println("Enter student contact : ");
				String contact = sc.next();
				stu.setContact(contact);

				flag = StudentDao.insertStudent(stu);
				if (flag) {
					System.out.println("Student Details added successfully........  :)  \n");
				} else {
					System.out.println(" Something went wrong:   :( \\n");
				}
				break;
			}
			case 2: {
				Student stu2 = new Student();
				System.out.println("......Display the student details : \n");
				System.out.println("Enter student id : ");
				int id = sc.nextInt();
				Student s = StudentDao.getStudent(id);
				System.out.println(s);
				break;
			}
			case 3: {
				Student stu3 = new Student();
				
				System.out.println("Enter student id which you want to delete : ");
				int id = sc.nextInt();
				flag = StudentDao.deleteStudent(stu3, id);
				if (flag) {
					System.out.println("Student detail deleted successfully.........");
				} else {
					System.out.println(" Something went wrong:   :( \\n");
				}
				break;
			}
			case 4: {
				Student stu4=new Student();//
				System.out.println("Enter student Details which you want to be update.........\n");
				System.out.println("Enter Student id : ");
				int id = sc.nextInt();
				System.out.println("Enter Student new Name: ");
				String nName = sc.next();
				System.out.println("Enter new Student contact : ");
				String nContact = sc.next();
				stu4.setSt_id(id);
				stu4.setSname(nName);
				stu4.setContact(nContact);
				flag = StudentDao.updateStudent(stu4);
				//flag = StudentDAO.updateStudentDetials(id,newName,newContact);
				if (flag) {
					System.out.println("Student details update Successfully... :)  ");
				} else {
					System.out.println("Something went wrong:   :( \n");
				}
				break;
			}
			case 9: {
				System.out.println("........Bye ! Have A Great Day.......  :) \n");
				flag1 = false;
				break;
			}
			default:
				System.out.println(".....Sorry.. you entered invalid number....!!");

			}
		}
	}

}
