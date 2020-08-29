package cn.itcast.domain;

import java.util.Date;

public class User {
    private String uName;
    private int age;
    private Date date;

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "uName='" + uName + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }
}
