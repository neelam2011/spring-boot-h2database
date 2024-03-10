package com.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//mark class as an Entity 
@Entity
//defining class name as Table name
@Table
public class Student 
{
//mark id as primary key
@Id
//defining id as column name
@Column
private int id;
//defining name as column name
@Column
private String firstName;
//defining age as column name

@Column
private String lastName;

@Column
private int age;
//defining email as column name
@Column
private String email;

@Column
private String job;




public int getId() 
{
return id;
}
public void setId(int id) 
{
this.id = id;
}

public int getAge() 
{
return age;
}
public void setAge(int age) 
{
this.age = age;
}
public String getEmail() 
{
return email;
}
public void setEmail(String email) 
{
this.email = email;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}

}