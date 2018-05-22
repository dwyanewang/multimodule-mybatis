package com.dwyanewang;

import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    public User getUserById(Long id);

}
