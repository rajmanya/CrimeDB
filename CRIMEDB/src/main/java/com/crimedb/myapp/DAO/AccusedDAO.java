package com.crimedb.myapp.DAO;

import org.hibernate.HibernateException;

import com.crimedb.myapp.pojo.Accused;


public class AccusedDAO extends DAO {
		public Accused createRecord(Accused a) throws Exception{
			try {
				begin();
				getSession().save(a);
	            commit();
			    return a;
		}
	catch(HibernateException e) {
		rollback();
	    throw new Exception("Exception while creating record: " + e.getMessage());
		}
	}
}
