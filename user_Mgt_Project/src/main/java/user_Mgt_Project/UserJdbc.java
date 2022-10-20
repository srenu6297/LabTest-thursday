package user_Mgt_Project;

import java.util.Scanner;

public class UserJdbc 
{
	
	
		public static void main (String args[])
		{
			while(true)
			{
				System.out.println("Press 1 to Create a UserName :");
				System.out.println("Press 2 to Update password :");
				System.out.println("Press 3 to Delete a User :");
				System.out.println("Press 4 to Retreive a User:");
				System.out.println("Press 5 to list of all User:");
				System.out.println("Press 6 to  Exit:");
				
				Scanner scan=new Scanner(System.in);
				int i=scan.nextInt();
				boolean flag;
				switch(i)
				{
					case 1:
				{
					System.out.println("Enter UserName :");
					String Bname=scan.next();
					System.out.println("Enter Password :");
					String name=scan.next();
					flag=userFile.insertUser(Bname, name);
					if(flag)
						System.out.println(" user detail add Successfully ...\n");
					else
						System.out.println("user detail not add Successfully ...\n");
					
				
					}
				break;
				
					case 2:
					{
						System.out.println("Enter new password to be updated  :");
						String newName=scan.next();
						System.out.println("Enter User name :");
						String Name=scan.next();
						
						flag=userFile.updatePassword(Name, newName);
						if(flag)
							System.out.println("user password update successfully ...\n");
						else
							
							System.out.println("Something went wrong: \n");
						
						
					break;	
					}
					
					
				
			case 3:
			{
				System.out.println("Enter user which you want to be deleted :");
				String Bname=scan.next();
				flag=userFile.deleteUser(Bname);
				if(flag)
					System.out.println(" User detail delete Successfully ...\n");
				else
					System.out.println("Something went wrong");
				
			break;
				
				
			}
			case 4:{
				System.out.println("Hey ! Enter user name to find user deatil......");
				String uname=scan.next();
				flag=userFile.retrieveUser(uname);
				if(flag)
					System.out.println(".....Detail display Successfully....\n");
				else
					System.out.println("......Something went wrong........");
					
				break;
           }
			case 5:
			{
				System.out.println(".....---List Of Users----......\n");
				flag=userFile.listOfUser();
				if(!flag)
					System.out.println("...---Something went wrong--- ...");
					
			break;	
			}
			
				
			
			case 6: {
					System.out.println("........Bye ! Have A Great Day.......\n");
					flag=false;
			       
					break;
			       }
			default: System.out.println(".....Sorry.. you entered invalid number....");
			}
		}

		}
	
}
