package com.userManagement;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserManagement 
{
	@Id
	private int jid;
	private String CandidateName;
	private String jProfile;
	private String contact;
	public UserManagement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserManagement(int jid, String candidateName, String jProfile, String contact) {
		super();
		this.jid = jid;
		this.CandidateName = candidateName;
		this.jProfile = jProfile;
		this.contact = contact;
	}
	public int getJid() {
		return jid;
	}
	public void setJid(int jid) {
		this.jid = jid;
	}
	public String getCandidateName() {
		return CandidateName;
	}
	public void setCandidateName(String candidateName) {
		CandidateName = candidateName;
	}
	public String getjProfile() {
		return jProfile;
	}
	public void setjProfile(String jProfile) {
		this.jProfile = jProfile;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "UserManagement [jid=" + jid + ", CandidateName=" + CandidateName + ", jProfile=" + jProfile
				+ ", contact=" + contact + "]";
	}
	
	
	
	
	

}
