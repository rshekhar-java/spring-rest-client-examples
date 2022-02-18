package com.rs.springframework.services;

import com.rs.springframework.api.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * created by rs 2/17/2022.
 */
public interface ApiService {
    List<User> getUsers(Integer limit);
    Flux<User> getUsers(Mono<Integer> limit);
}
