package com.crimedb.myapp.DAO;

import org.hibernate.HibernateException;
import com.crimedb.myapp.pojo.Victim;

public class VictimDAO extends DAO {
	public Victim createRecord(Victim v) throws Exception{
		try {
			begin();
			getSession().save(v);
            commit();
		    return v;
	}
catch(HibernateException e) {
	rollback();
    throw new Exception("Exception while creating record: " + e.getMessage());
	}
}

}
