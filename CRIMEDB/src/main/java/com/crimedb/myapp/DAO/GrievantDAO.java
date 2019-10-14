package com.crimedb.myapp.DAO;

import org.hibernate.HibernateException;

import com.crimedb.myapp.pojo.Grievant;


public class GrievantDAO extends DAO {
		public Grievant createRecord(Grievant g) throws Exception{
			try {
				begin();
				getSession().save(g);
	            commit();
			    return g;
		}
	catch(HibernateException e) {
		rollback();
	    throw new Exception("Exception while creating record: " + e.getMessage());
		}
	}
}
