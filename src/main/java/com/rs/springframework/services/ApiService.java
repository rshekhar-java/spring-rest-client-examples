package com.rs.springframework.services;

import com.rs.springframework.api.domain.User;

import java.util.List;

/**
 * created by rs 2/17/2022.
 */
public interface ApiService {
    List<User> getUsers(Integer limit);
}
