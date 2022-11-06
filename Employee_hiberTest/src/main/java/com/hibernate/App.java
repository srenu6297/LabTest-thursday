//Author Name : Renu Sharma

/*
 * 1.Create two entities---(20 markks)

EMPLOYEE
 
    EMP_ID INT NOT NULL AUTO_INCREMENT,
    NAME VARCHAR(252),
    DEPARTMENT VARCHAR(128),
    SALARY long,
     PRIMARY KEY (EMP_ID)



EMP_DETAILS 
 
    ED_ID INT NOT NULL AUTO_INCREMENT,
   
    ADDRESS VARCHAR(252),
    GENDER VARCHAR(8),
    BANK_ACCOUNT VARCHAR(128),
    PRIMARY KEY (ED_ID),

     @OnetoOne 
    
     Employee  emp,


    //FOREIGN KEY (EMP_ID) REFERENCES EMPLOYEES(EMP_ID)


Use one to one mapping(unidirectional ) and insert 3 records in table EMP_Details and fetch records and diplay.
(Use Query query=session.createQuery("From EMP_DETAILS") and query.list() to fetch records.)


 */

package com.hibernate;

import java.util.List;

import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Session session = HiberUtil.getSession();
		
		
		Employee emp1 = new Employee();
		emp1.setName("Renu");
		emp1.setDepartment("Developer");
		emp1.setSalary(20000);

		Employee emp2 = new Employee();
		emp2.setName("Anju");
		emp2.setDepartment("Education");
		emp2.setSalary(30000);

		Employee emp3 = new Employee();
		emp3.setName("Monika");
		emp3.setDepartment("Finance");
		emp3.setSalary(50000);

		Emp_Details emp_d1 = new Emp_Details();
		emp_d1.setEd_id(1);
		emp_d1.setGender("FeMale");
		emp_d1.setBank_account("Punjab National Bank");
		emp_d1.setAddress("Gurugam");
		emp_d1.setEmp(emp1);

		Emp_Details emp_d2 = new Emp_Details();
		emp_d2.setEd_id(2);
		emp_d2.setGender("Female");
		emp_d2.setBank_account("Gurgaon Gramin Bank");
		emp_d2.setAddress("Rewari");
		emp_d2.setEmp(emp2);

		Emp_Details emp_d3 = new Emp_Details();
		emp_d3.setEd_id(3);
		emp_d3.setGender("FeMale");
		emp_d3.setBank_account("State Bank of India");
		emp_d3.setAddress("Manesar");
		emp_d3.setEmp(emp3);

		Transaction t1 = session.beginTransaction();
		session.save(emp_d1);
		session.save(emp_d2);
		session.save(emp_d3);
		t1.commit();

		Query query = session.createQuery("From Emp_Details");
		List<Emp_Details> list = query.getResultList();
		for (Emp_Details s : list) {
			System.out.println(s);
		}
		session.close();
	}


}
