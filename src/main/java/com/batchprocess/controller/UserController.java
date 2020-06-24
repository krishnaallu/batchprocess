package com.batchprocess.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.batchprocess.response.ResponseElementWrapper;
import com.batchprocess.service.UserServiceImpl;

@CrossOrigin
@RestController
@RequestMapping(value = "/batchprocess")
public class UserController {
	@Autowired
	UserServiceImpl userServiceImpl;

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	private ResponseElementWrapper test() throws Exception {
		userServiceImpl.getUsers();
		return new ResponseElementWrapper("200", "Success", "Hey this is Succsess");
	}

}
