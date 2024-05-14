package com.chatBot.springboot.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="students")
public class User {

    @Id
    private String _id;
    private String username;
    private String interactionHistory;
    private String contextualData;
    private String analytics;
    private String email;
    private String password;
    private boolean isAdmin;

    public User(String _id, String username, String interactionHistory, String contextualData, String analytics, String email, String password, boolean isAdmin) {
        this._id = _id;
        this.username = username;
        this.interactionHistory = interactionHistory;
        this.contextualData = contextualData;
        this.analytics = analytics;
        this.email = email;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public User() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getInteractionHistory() {
        return interactionHistory;
    }

    public void setInteractionHistory(String interactionHistory) {
        this.interactionHistory = interactionHistory;
    }

    public String getContextualData() {
        return contextualData;
    }

    public void setContextualData(String contextualData) {
        this.contextualData = contextualData;
    }

    public String getAnalytics() {
        return analytics;
    }

    public void setAnalytics(String analytics) {
        this.analytics = analytics;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    @Override
    public String toString() {
        return "User{" +
                "_id='" + _id + '\'' +
                ", username='" + username + '\'' +
                ", interactionHistory=" + interactionHistory +
                ", contextualData=" + contextualData +
                ", analytics=" + analytics +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", isAdmin=" + isAdmin +
                '}';
    }
}
