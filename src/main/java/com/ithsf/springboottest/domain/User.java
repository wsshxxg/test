package com.ithsf.springboottest.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Table(name = "ro_user")
@Data
public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Integer id;
        @Column(name = "username")
        private String username;
        @Column(name = "password")
        private String password;
        @Column(name = "email")
        private String email;
        @Column(name = "create_time")
        private Date createTime;


}
