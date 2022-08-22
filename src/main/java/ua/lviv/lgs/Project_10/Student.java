package ua.lviv.lgs.Project_10;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	private int id;
	
	
	private User user;

	
	@Autowired
	public Student(User user) {
		super();
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", user=" + user + "]";
	} 
	
	
	
	
	

}
