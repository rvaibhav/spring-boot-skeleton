package com.retailer.backend.mockservices.service;

import com.retailer.backend.mockservices.entity.User;
import com.retailer.backend.mockservices.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

/**
 * Created by vaibhavr on 11/03/16.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    @Transactional
    public User save(final User user) {
        return repository.save(user);
    }

}
