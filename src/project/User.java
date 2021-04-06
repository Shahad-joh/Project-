/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author ahadj
 */
public class User {
    
private long id;
private String username;
private int salary;
private int password;



public User (String username ,int password ){
    
    this.username = username; 
    this.password = password;
        
}

    User() {
       
    }

public long getId() {
    return id;
}
public void setId(long id) {
    this.id = id;
}
public String getusername() {
    return username;
}
public void setusername(String username) {
    this.username = username;
}
public int getSalary() {
    return salary;
}
public void setSalary(int salary) {
    this.salary = salary;
}
public int getpassword() {
    return password;
}
public void setpassword(int password) {
    this.password = password;
}

   
}
    
