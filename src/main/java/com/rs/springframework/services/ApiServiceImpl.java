package com.rs.springframework.services;

import com.rs.springframework.api.domain.User;
import com.rs.springframework.api.domain.UserData;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * created by rs 2/17/2022.
 */
@Service
public class ApiServiceImpl implements ApiService {
    private RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Integer limit) {
//        UserData userData = restTemplate.getForObject("http://apifaketory.com/api/user?limit="+limit, UserData.class);

        UserData userData = restTemplate.getForObject("http://dummy.restapiexample.com/api/v1/employees", UserData.class);
        return userData.getData();
    }
}
