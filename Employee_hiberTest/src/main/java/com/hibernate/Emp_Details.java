//Author Name : Renu Sharma

/*
 * EMP_DETAILS 
 
    ED_ID INT NOT NULL AUTO_INCREMENT,
   
    ADDRESS VARCHAR(252),
    GENDER VARCHAR(8),
    BANK_ACCOUNT VARCHAR(128),
    PRIMARY KEY (ED_ID),

     @OnetoOne 
    
     Employee  emp,


    //FOREIGN KEY (EMP_ID) REFERENCES EMPLOYEES(EMP_ID)


 */

package com.hibernate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Emp_Details_O2o")

public class Emp_Details {


	@Id
	@GeneratedValue
	@Column(name = "ed_id", nullable = false)
	private int ed_id;
	@Column(name = "address", length = 252, nullable = true)
	private String address;
	@Column(name = "gender", length = 8, nullable = true)
	private String gender;
	@Column(name = "bank_account", length = 128, nullable = true)
	private String bank_account;

	@OneToOne(cascade = CascadeType.ALL)
	private Employee emp;


	public Emp_Details() {
		// TODO Auto-generated constructor stub
	}
	

	public Emp_Details(int ed_id, String address, String gender, String bank_account, Employee emp) {
		super();
		this.ed_id = ed_id;
		this.address = address;
		this.gender = gender;
		this.bank_account = bank_account;
		this.emp = emp;
	}

	public int getEd_id() {
		return ed_id;
	}

	public void setEd_id(int ed_id) {
		this.ed_id = ed_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBank_account() {
		return bank_account;
	}

	public void setBank_account(String bank_account) {
		this.bank_account = bank_account;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}
 
	@Override
	public String toString() {
		return "Emp_details [ed_id=" + ed_id + ", address=" + address + ", gender=" + gender + ", bank_account="
				+ bank_account + ", emp=" + emp + "]";
	}

}
