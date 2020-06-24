package com.batchprocess.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.batchprocess.response.ResponseElementWrapper;;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private EntityManager manager;

	@Override
	public ResponseElementWrapper getUsers() throws Exception {
		try {
			String nativeQuery = "select * from \"fcCategory\"";

			Query q = manager.createNativeQuery(nativeQuery);
			List<Object[]> users = q.getResultList();
			for (Object[] user : users) {
				System.out.println("user[0] " + user[1]);
			}

		} catch (Error t) {
			System.out.println(t.getStackTrace());
		}

		return new ResponseElementWrapper("200", "Success", "Finally");
	}

}
