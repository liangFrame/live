package com.lframe.live.pojo;

public class User {
    private Integer id;

    private String nickname;

    private String username;

    private String password;

    private Integer age;

    private String personalizedsig;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPersonalizedsig() {
        return personalizedsig;
    }

    public void setPersonalizedsig(String personalizedsig) {
        this.personalizedsig = personalizedsig == null ? null : personalizedsig.trim();
    }
}