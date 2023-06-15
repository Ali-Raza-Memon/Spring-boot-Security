package com.spring.security.service;

import com.spring.security.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    List<User> list = new ArrayList<>();

    public UserService(){
        list.add(new User("abc","abc","abc@gmail.com"));
        list.add(new User("xyz","abcxyz","xyzabc@gmail.com"));

    }

}
