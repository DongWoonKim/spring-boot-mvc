package com.example.springbootmvc.ui.service;

import com.example.springbootmvc.shared.Utils;
import com.example.springbootmvc.ui.model.request.UserDetailsRequestModel;
import com.example.springbootmvc.ui.model.response.UserRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    Map<String, UserRest> users;
    Utils utils;

    public UserServiceImpl() {}

    @Autowired
    public UserServiceImpl(Utils utils) {
        this.utils = utils;
    }

    @Override
    public UserRest createUser(UserDetailsRequestModel userDetails) {

        UserRest returnVal = new UserRest();
        returnVal.setEmail(userDetails.getEmail());
        returnVal.setFirstName(userDetails.getFirstName());
        returnVal.setLastName(userDetails.getLastName());

        String userId = utils.generateUserId();
        returnVal.setUserId(userId);

        if (users == null) users = new HashMap<>();
        users.put(userId, returnVal);

        return returnVal;
    }
}
