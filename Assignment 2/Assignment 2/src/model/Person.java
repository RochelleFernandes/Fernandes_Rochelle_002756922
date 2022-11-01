/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author roche
 */
public class Person {
    private String firstName;
    private String lastName;
    private String age;
    private String residence;
    private String community;
    private String city;
    private boolean isPatient;
    private int id;
    
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
    
    public String getAge() {
        return age;
    }
    
    public void setAge(String age) {
        this.age = age;
    }
    
    public String getResidence() {
        return residence;
    }
    
    public void setResidence(String residence) {
        this.residence = residence;
//        addHouse(residence);
    }
    
    public String getCommunity() {
        return community;
    }
    
    public void setCommunity(String community) {
        this.community = community;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public boolean isIsPatient() {
        return isPatient;
    }
    
    public void setIsPatient(boolean isPatient) {
        this.isPatient = isPatient;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
}
