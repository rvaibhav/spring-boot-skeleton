package com.retailer.backend.mockservices.repository;

import com.retailer.backend.mockservices.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by vaibhavr on 11/03/16.
 */
public interface UserRepository extends JpaRepository<User,String>{

}
