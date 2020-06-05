package com.ye.controller;

import com.ye.pojo.Car;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Demo class
 *
 * @author 张烨
 * @date 2020/6/2 21:08
 */
@RestController
public class HelloController {

    @RequestMapping("/getName")
    public String getName(){
        return "为什么，我已经道过歉了";
    }

    @RequestMapping("/car")
    public Car car(Car car){
        return car;
    }

    @RequestMapping("/car2")
    public Car car2(@RequestBody Car car){
        return car;
    }
}
