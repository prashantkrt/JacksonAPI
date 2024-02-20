package com.myLearning.pojo;

import java.util.Arrays;
import java.util.List;


public class Implementers {

	private Integer id;
	private String name;
	private String city;
	private boolean active;	
	
	//Association HAS A relationship
	private Course course;
	

	private String[] hobbies;
 
	
	private List<String> interests;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public List<String> getInterests() {
		return interests;
	}

	public void setInterests(List<String> interests) {
		this.interests = interests;
	}

	@Override
	public String toString() {
		return "Implementers [id=" + id + ", name=" + name + ", city=" + city + ", active=" + active + ", course="
				+ course + ", hobbies=" + Arrays.toString(hobbies) + ", interests=" + interests + "]";
	}

	public Implementers(Integer id, String name, String city, boolean active, Course course, String[] hobbies,
			List<String> interests) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.active = active;
		this.course = course;
		this.hobbies = hobbies;
		this.interests = interests;
	}

	public Implementers() {
		super();
	}
	 
}