package com.rss.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

import com.rss.pojo.User;

public class LoginDao {

	public List<User> getUser(String userName,String password){
        SessionFactory  sessionFactory = HUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        System.out.println("Database connection created successfuly.");
 
		Criteria criteria = session.createCriteria(User.class);
		Criterion isName = Restrictions.eq("name", userName);
		Criterion isPass = Restrictions.eq("password",password);
		// To get records matching with AND conditions
		LogicalExpression andExp = Restrictions.and(isName, isPass);
		criteria.add( andExp );
		List<User> user = criteria.list();
		System.out.println(user);
		session.close();
		return user;
		
	}
	
	public void saveUserData(String userName,String password){
        SessionFactory  sessionFactory = HUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
		session.beginTransaction();
		User user = new User();
		user.setName(userName);
		user.setPassword(password);
		session.save(user);
		session.getTransaction().commit();
	}
}
