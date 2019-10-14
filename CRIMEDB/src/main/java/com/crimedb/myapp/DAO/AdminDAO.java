package com.crimedb.myapp.DAO;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.crimedb.myapp.pojo.Admin;
import com.crimedb.myapp.pojo.User;





public class AdminDAO extends DAO {
	public Admin loginAdmin(String username, String password)
	{
		Admin admin=null;
		try {
			begin();
			Query q = getSession().createQuery("from admin where Username = :username and Password = :password");
			q.setString("username", username);
			q.setString("password", password);			
			 admin = (Admin) q.uniqueResult();
			commit();
			return admin;
		} catch (HibernateException e) {
			rollback();
		}
		return admin;
}
	public void grantUserAccess(User user) 
	{
		try {
		begin();
		getSession().save(user);
		commit();
		}catch(HibernateException e) {
			rollback();
		}
	}
	
	public void DeleteUser(User u) {
		try {
			            begin();
			            getSession().delete(u);
			            commit();
			        } catch (HibernateException e) {
			         rollback(); 
			        }
}
	}
 