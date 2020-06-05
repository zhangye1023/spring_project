package com.ye.controller;

import com.ye.pojo.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Demo class
 *
 * @author 张烨
 * @date 2020/6/3 20:15
 */
@RestController
@RequestMapping("/user")
public class UserController {

    List<User> list=new ArrayList<>();

    @PostMapping("/")
    @ApiOperation(value="新增用户", notes="新增用户信息")
    @ApiImplicitParam(name = "user", value = "用户信息实体user", required = true, dataType = "pojo实体类的User")
    public List<User> add(User user){
        list.add(user);
        return list;
    }

    @GetMapping("/")
    @ApiOperation(value="获取全部用户信息", notes="获取全部用户列表信息")
    public List<User> find(){
        return list;
    }

    @GetMapping("/{id}")
    @ApiOperation(value="获取指定id用户信息", notes="根据id获取单个用户信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    public User findOne(@PathVariable("id") Long userId){
        for (User user : list) {
            if (user.getId().longValue()==userId.longValue()){
                return user;
            }
        }
        return null;
    }

    @PutMapping("/")
    @ApiOperation(value="更新指定id用户信息", notes="根据id更新用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "user", value = "用户信息实体user", required = true, dataType = "User")
    })
    public List<User> update(@RequestBody User user){
        for (User temp : list) {
            if (temp.getId().longValue()==user.getId().longValue()){
                temp.setName(user.getName());
                temp.setAge(user.getAge());
            }
        }
        return list;
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value="删除指定id用户", notes="根据id删除用户")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    public List<User> del(@PathVariable("id") Long userId){
        List<User> newList=new ArrayList<>();
        for (User user : list) {
            if (user.getId().longValue()!= userId.longValue()){
                newList.add(user);
            }
        }

        list=newList;
        return list;
    }
}
