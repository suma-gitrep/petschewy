package com.example.petsandroid.Model;

public class Users
{
    private String name, phone, password, image, address,usertype,email;

    public Users()
    {

    }

    public Users(String name, String phone, String password, String image, String address,String usertype,String email) {
        this.name = name;
        this.phone = phone;
        this.password = password;
        this.image = image;
        this.address = address;
        this.usertype=usertype;
        this.email=email;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
