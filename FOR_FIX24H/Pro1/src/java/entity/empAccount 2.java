/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Hoang
 */
public class empAccount {

    int id;
    String name, username, email, phonenumber, password, district, city, icard, license,des,ficard,bicard,isCustomer;

    public empAccount(int id, String name, String username, String email, String phonenumber, String password, String district, String city, String icard, String license, String des, String ficard, String bicard, String isCustomer) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.phonenumber = phonenumber;
        this.password = password;
        this.district = district;
        this.city = city;
        this.icard = icard;
        this.license = license;
        this.des=des;
        this.ficard=ficard;
        this.bicard=bicard;
        this.isCustomer=isCustomer;
    }

    public String getIsCustomer() {
        return isCustomer;
    }

    public void setIsCustomer(String isCustomer) {
        this.isCustomer = isCustomer;
    }

    public String getLicense() {
        return license;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getFicard() {
        return ficard;
    }

    public void setFicard(String ficard) {
        this.ficard = ficard;
    }

    public String getBicard() {
        return bicard;
    }

    public void setBicard(String bicard) {
        this.bicard = bicard;
    }

    public void setLicense(String license) {
        this.license = license;
    }

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIcard() {
        return icard;
    }

    public void setIcard(String icard) {
        this.icard = icard;
    }

    @Override
    public String toString() {
        return "empAccount{" + "id=" + id + ", name=" + name + ", username=" + username + ", email=" + email + ", phonenumber=" + phonenumber + ", password=" + password + ", district=" + district + ", city=" + city + ", icard=" + icard + ", license=" + license + ", des=" + des + ", ficard=" + ficard + ", bicard=" + bicard + ", isCustomer=" + isCustomer + '}';
    }

 

  

}
