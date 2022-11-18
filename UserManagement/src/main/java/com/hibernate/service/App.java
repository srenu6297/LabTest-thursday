package com.hibernate.service;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.userManagement.UserManagement;
import com.userManagementDao.UserManagementDao;
import com.userManagementImpl.UserManagementImpl;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserManagementDao usm=(UserManagementDao) ac.getBean("umdao");
        UserManagement us=new UserManagement(123,"renu","java developer","643676437");
        usm.insertUser(us);
        System.out.println(us);
        
        char ch='y';
		//while loop
		while (ch=='y') {
			
			System.out.println("Choose any options on which you want to perform task :\n");
			
			System.out.println("Option 1st to insert the user details: ");
			System.out.println("Option 2nd to Retreive the user details: ");
			System.out.println("Option 3rd to update the user details: ");
			System.out.println("Option 4th to delete user details: ");
			System.out.println("Option 5th  to display all user details: ");
			System.out.println("Option 6th to exit:");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Choose any options which you want to choose :\n");
			int i = sc.nextInt();
			//switch cases
			switch (i) {
			
			case 1: {
				UserManagement um = new UserManagement();
				System.out.println("insert User job id:");
				int us1 = sc.nextInt();
				um.setJid(us1);
				System.out.println("insert Candidate name:");
				String us2 = sc.next();
				um.setCandidateName(us2);
				System.out.println("insert Candidate job profile");
				String us3 = sc.next();
				um.setjProfile(us3);
				System.out.println("insert Candidate Contact no. ");
				String us4 = sc.next();
				um.setjProfile(us4);

				int i1 = usm.insertUser(um);
				if (i1 == 1)
					System.out.println("user details inserted successfully...");
				else
					System.out.println("...........Something went wrong.......\n");
				break;
			}
			case 2: {
				System.out.println("enter jid to get specific user detail: ");
				int jid=sc.nextInt();
				UserManagement um=usm.retrieveUser(jid);
				System.out.println("User Details : ");
				System.out.println(um);
				break;
			}
			case 3: {
				UserManagement u1 = new UserManagement();
				System.out.println("enter id where to update the user details...");
				int us1 = sc.nextInt();
				u1.setJid(us1);
				System.out.println("enter user new name to update...");
				String us2 = sc.next();
				u1.setCandidateName(us2);
				System.out.println("enter user new job profile to update...");
				String us3 = sc.next();
				u1.setjProfile(us3);
				System.out.println("enter user new Contact no. to update...");
				String us4 = sc.next();
				u1.setjProfile(us4);
				int i2 = usm.updateUser(u1);
				if (i2 == 1)
					System.out.println("user details updated successfully...");
				else
					System.out.println("...........Something went wrong.......\n");
				break;
			}
			
			case 4: {
				UserManagement u2 = new UserManagement();
				System.out.println("enter the user id for whose record you want to delete :");
				int us1 = sc.nextInt();
				u2.setJid(us1);
				int i3 = usm.deleteUser(u2);
				if (i3 == 1)
					System.out.println("user details deleted successfully...");
				else
					System.out.println("...........Something went wrong.......\n");
				break;

			}
			case 5: {
				UserManagement u3 = new UserManagement();
				System.out.println("displaying all users details...");

				List<UserManagement> list = usm.AllUserDetails();
				System.out.println("\n" + list + "\n");
				break;
			}
			 
			case 6:{
				System.out.println("........Bye ! Have A Great Day.......\n");
				ch='n';
				break;
			}
			//default
			default:
				System.out.println(".....Sorry.. you entered invalid number....");
			}
			System.out.println("do you want to continue y/n...");
			ch=sc.next().charAt(0);
		}



    }

 
}		

