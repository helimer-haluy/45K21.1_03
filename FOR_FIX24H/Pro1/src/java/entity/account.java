/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Hi
 */
public class account {
     int id;
     String name;
     String username;
     String password;
     String email;
     String phonenumber;
     String isCustomer;


    public account() {
    }

    public account(int id, String name,String username, String password, String email, String phonenumber, String isCustomer) {
        this.id = id;
        this.name= name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phonenumber = phonenumber;
        this.isCustomer = isCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public int getid() {
        return id;
    }

    public void setid(int id) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String isIsCustomer() {
        return isCustomer;
    }

    public void setIsCustomer(String isCustomer) {
        this.isCustomer = isCustomer;
    }

    @Override
    public String toString() {
        return "account{" + "id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + ", email=" + email + ", phonenumber=" + phonenumber + ", isCustomer=" + isCustomer + '}';
    }

    

    
   
    
}
