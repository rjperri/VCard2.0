package com.example.demo.services;

import com.example.demo.domain.User;

/**
 *
 * @author rjperri
 */
public interface UserService extends CRUDService<User> {
    
    User findByUsername(String username);

}
