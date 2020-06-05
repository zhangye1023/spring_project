package com.ye.dao;

import com.ye.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Demo class
 *
 * @author 张烨
 * @date 2020/6/4 18:13
 */
public interface UserDao extends JpaRepository<User,Long> {

}
