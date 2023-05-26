package com.example.chatwithfriends.Model;

public class Users {

    String profilePic , Mail , Password , userName , userId , lastMessage;

    public Users(String profilePic, String userName, String mail, String password, String userId, String lastMessage) {
        this.profilePic = profilePic;
        Mail = mail;
        Password = password;
        this.userName = userName;
        this.userId = userId;
        this.lastMessage = lastMessage;
    }

    public Users(){}

//    Sign Up Constructor
    public Users(String userName, String mail, String password) {
        Mail = mail;
        Password = password;
        this.userName = userName; 
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }
}
