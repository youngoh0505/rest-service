package com.example.restservice.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

// @Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
// @JsonIgnoreProperties(value = {"password", "ssn"})
// @JsonFilter("UserInfo")
public class User {

    // @Id
    // @GeneratedValue
    private Integer id;

    @Size(min = 2, message = "Name은 2글자 이상 입력하세요")
    private String name;
    private Date joinDate;

    // @JsonIgnore
    private String password;
    private String ssn;

    // @OneToMany(mappedBy = "user")
    // private List<Post> postList;

    // public User(Integer id, @Size(min = 2, message = "Name은 2글자 이상 입력하세요") String
    // name, Date joinDate, String password,
    // String ssn) {
    // this.id = id;
    // this.name = name;
    // this.joinDate = joinDate;
    // this.password = password;
    // this.ssn = ssn;
    // }

}
