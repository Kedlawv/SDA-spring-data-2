package com.sda.springdata.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Customer")
public class User {

    public User() {
    }

    public User(@Size(min = 2, max = 25, message = "field lenght must be between 2 and 15characters") String nickName, String email) {
        this.nickName = nickName;
        this.email = email;
    }

    @Id
    @GeneratedValue
    private long id;
    @Size(min = 2, max = 25, message = "field lenght must be between 2 and 15characters")

    @Column(name = "nick")
    private String nickName;
    private String email;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}