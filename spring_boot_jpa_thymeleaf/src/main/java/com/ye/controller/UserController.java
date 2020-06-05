package com.ye.controller;

import com.ye.pojo.User;
import com.ye.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Demo class
 *
 * @author 张烨
 * @date 2020/6/4 18:27
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /***
     * 获取全部用户信息
     *
     * @return
     */
    @GetMapping("/")
    public String getUserList(Model model) {
        List<User> list = userService.getUserList();
        model.addAttribute("page", list);
        return "user/list";
    }

    /***
     * 跳转到新增用户界面
     *
     * @param user
     * @return
     */
    @GetMapping("/toAdd")
    public String toAdd(User user) {
        return "user/userAdd";
    }

    /***
     * 新增用户
     *
     * @param user
     * @return
     */
    @PostMapping("/add")
    public String createUser(User user) {
        userService.createUser(user);
        return "redirect:/user/";
    }

    /**
     * 去用户详情页
     * @param model
     * @param id
     * @return
     */
    @GetMapping("/toEdit/{id}")
    public String toEdit(Model model, @PathVariable("id") Long id) {
        User user = userService.getUser(id);
        model.addAttribute("user", user);
        return "user/userEdit";
    }

    /**
     * 修改
     * @param user
     * @return
     */
    @PutMapping("/edit")
    public String edit(User user) {
        userService.updateUser(user);
        return "redirect:/user/";
    }

    /***
     * 删除指定id用户
     *
     * @param id
     * @return
     */
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
        return "redirect:/user/";
    }

}
