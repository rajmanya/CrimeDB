package com.crimedb.myapp.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User {
	  @Id 
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="id", unique = true, nullable = false)
	   private long id;

	    @Column(name = "username")
	    private String username;

	    @Column(name = "password")
	    private String password;
	    
	    @Column(name="status")
	    private int status;
	    
	    public User() {
	    
	    }

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public int getStatus() {
			return status;
		}

		public void setStatus(int status) {
			this.status = status;
		}

}
