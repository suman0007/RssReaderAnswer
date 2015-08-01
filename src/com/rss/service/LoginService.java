package com.rss.service;

import java.util.List;

import com.rss.dao.LoginDao;
import com.rss.pojo.User;

public class LoginService {
	public Boolean checkUserExistance(String userName,String password){
		LoginDao loginDao = new LoginDao();
		List<User> user = loginDao.getUser(userName,password);
		if(user.isEmpty()){
		return false;
		}else{
			return true;
		}
	}
	
	public void saveUser(String userName,String password){
		LoginDao loginDao = new LoginDao();
		loginDao.saveUserData(userName,password);
	}
}
