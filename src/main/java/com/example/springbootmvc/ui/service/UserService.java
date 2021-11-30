package com.example.springbootmvc.ui.service;

import com.example.springbootmvc.ui.model.request.UserDetailsRequestModel;
import com.example.springbootmvc.ui.model.response.UserRest;

public interface UserService {

    UserRest createUser(UserDetailsRequestModel userDetailsRequestModel );

}
