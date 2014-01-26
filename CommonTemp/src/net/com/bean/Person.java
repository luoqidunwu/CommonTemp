package net.com.bean;

public class Person {
	private int id;
	private String name;
	private int age;
	private String sex;
	private String date;

	public int getId() {
		return id;
	}
 
	public void setId(int id) {
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age
				+ ", sex=" + sex + ", date=" + date + "]";
	}
	
	
}
