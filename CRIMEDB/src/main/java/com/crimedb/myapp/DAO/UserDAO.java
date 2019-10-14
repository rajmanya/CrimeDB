package com.crimedb.myapp.DAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.query.Query;

import com.crimedb.myapp.pojo.User;


public class UserDAO extends DAO {
	public UserDAO() {
		
	}
	
	public User addUser(User u) {
		try {
			begin();
			getSession().save(u);
			commit();
			}catch(HibernateException e) {
				rollback();
				
			}
		return u;
	}
	public User loginUser(String username, String password)
	{
		User user=null;
		try {
			begin();
			Query q = getSession().createQuery("from user where Username = :username and Password = :password");
			q.setString("username", username);
			q.setString("password", password);			
			 user = (User) q.uniqueResult();
			commit();
			return user;
		} catch (HibernateException e) {
			rollback();
		}
		return user;
}
	public List<User> getUserList(){
		try {
			begin();
			Query q = getSession().createQuery("from user where status = :sta");
			q.setInteger("sta", 0);
			List<User> userList = q.list();
			commit();
			return userList;
		}catch(HibernateException e) {
			rollback();
		}
		return null;
		
	}
	public User getUser(int id)
	{
		try {
			begin();
			Query q = getSession().createQuery("from user where id = :idd");
			q.setInteger("idd", id);
			User u = (User) q.uniqueResult();
			commit();
			return u;
		} catch (HibernateException e) {
			rollback();
		}
		return null;
	}
	public List<User> getValidUserList(){
		try {
			begin();
			Query q = getSession().createQuery("from user where status = :sta");
			q.setInteger("sta", 1);
			List<User> userList = q.list();
			commit();
			return userList;
		}catch(HibernateException e) {
			rollback();
		}
		return null;
		
	}
	}
	
	
	