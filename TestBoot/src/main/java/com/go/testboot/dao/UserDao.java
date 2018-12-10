package com.go.testboot.dao;


import org.springframework.data.repository.CrudRepository;
import com.go.testboot.model.Users;


public interface UserDao extends CrudRepository<Users,String> {

}
