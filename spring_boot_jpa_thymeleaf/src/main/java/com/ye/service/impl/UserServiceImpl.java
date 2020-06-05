package com.ye.service.impl;

import com.ye.dao.UserDao;
import com.ye.pojo.User;
import com.ye.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Demo class
 *
 * @author 张烨
 * @date 2020/6/4 18:15
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUserList() {
        return userDao.findAll();
    }

    @Override
    public User getUser(Long id) {
        return userDao.findById(id).get();
    }

    @Override
    public void createUser(User user) {
        userDao.save(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userDao.deleteById(id);
    }

}
