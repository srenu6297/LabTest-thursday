package com.userManagementDao;

import java.util.List;

import com.userManagement.UserManagement;

public interface UserManagementDao 
{
	public int insertUser(UserManagement us);
	public UserManagement retrieveUser(int jid);
	public int updateUser(UserManagement us);
	public int deleteUser(UserManagement us);
	public  List<UserManagement>AllUserDetails();
	
}
