package com.example.controller;

import com.example.common.ResultBean;
import com.example.entity.User;
import com.example.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * <p>
 *
 * @author xh
 * @since 2020-07-15
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping ("/{id}")
    public ResultBean getUserById(@PathVariable int id){
        logger.info("UserController --getUserById");
        return userService.selectByPrimaryKey(id);
    }

    @PostMapping("/")
    public ResultBean insertSelective(@RequestBody User user){

        return userService.insertSelective(user);

    }
}
