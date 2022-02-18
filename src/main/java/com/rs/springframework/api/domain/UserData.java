package com.rs.springframework.api.domain;

import java.io.Serializable;
import java.util.List;

/**
 * created by rs 2/17/2022.
 */
public class UserData {

    List<User> data;

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }
}
