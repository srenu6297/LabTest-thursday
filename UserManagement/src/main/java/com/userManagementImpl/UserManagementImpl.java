package com.userManagementImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.userManagement.UserManagement;
import com.userManagementDao.UserManagementDao;

public  class UserManagementImpl implements UserManagementDao
{
	private HibernateTemplate ht;
	
	
	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	@Transactional
	public int insertUser(UserManagement us) {
		ht.save(us);
		return 1;
		
		
	}

	public UserManagement retrieveUser(int jid) {
		UserManagement u=ht.get(UserManagement.class, jid);
		return u;

	}
	@Transactional
	public int updateUser(UserManagement us) {
		ht.update(us);
		return 1;
		
	}
	@Transactional
	public int deleteUser(UserManagement us) {
		ht.delete(us);
		return 1;
		
	}

	

	public  List<UserManagement>AllUserDetails() 
	{
		List<UserManagement> us = ht.loadAll(UserManagement.class);
		return us;
		
	}

}
