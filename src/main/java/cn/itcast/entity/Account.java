package cn.itcast.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Account implements Serializable {

    private int id;
    private String userName;
    private String passWord;
    private User user;

    private List<User> list;

    private Map<String,User> map;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getUsers() {
        return list;
    }

    public void setUsers(List<User> users) {
        this.list = users;
    }

    public Map<String, User> getMap() {
        return map;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", user=" + user +
                ", list=" + list +
                ", map=" + map +
                '}';
    }
}
