package com.ye.service;

import com.ye.pojo.User;

import java.util.List;

/**
 * Demo class
 *
 * @author 张烨
 * @date 2020/6/4 18:14
 */
public interface UserService {

    /**
     * 获取全部用户数据
     * @return
     */
    public List<User> getUserList();

    /**
     * 获取指定id用户信息
     * @param id
     * @return
     */
    public User getUser(Long id);

    /**
     * 新增用户数据
     * @param user
     */
    public void createUser(User user);

    /**
     * 更新指定id用户信息
     * @param user
     */
    public void updateUser(User user);

    /**
     * 删除指定id用户
     * @param id
     */
    public void deleteUser(Long id);

}
