package mongo;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class User {
	
	@Id
	public String id;
	public String name;
	public int age;
	public String email;
	
	
	public User(){}


	public User(String name, int age, String email) {
		this.name = name;
		this.age = age;
		this.email = email;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	
	
	

}
