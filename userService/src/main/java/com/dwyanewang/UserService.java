package com.dwyanewang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.dwyanewang.User;
import com.dwyanewang.UserDao;

@Service
public class UserService {

   @Autowired
    private UserDao userDao;
    public User getUserById(Long id){
        return userDao.getUserById(id);
    }
}
