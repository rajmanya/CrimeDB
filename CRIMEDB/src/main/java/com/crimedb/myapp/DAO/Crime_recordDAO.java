package com.crimedb.myapp.DAO;

import org.hibernate.HibernateException;

import com.crimedb.myapp.pojo.Crime_record;

public class Crime_recordDAO extends DAO {
	
	public Crime_record createRecord(Crime_record cr) throws Exception{
		try {
			begin();
			getSession().save(cr);
            commit();
		    return cr;
	}
		
		
catch(HibernateException e) {
	rollback();
    throw new Exception("Exception while creating record: " + e.getMessage());
	}
}

	
}
