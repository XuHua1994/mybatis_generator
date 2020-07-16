package com.example.service;

import com.example.common.ResultBean;
import com.example.dao.UserMapper;
import com.example.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 *
 * @author xh
 * @since 2020-07-16
 */
@Service
public class UserService {
    private static Logger logger= LoggerFactory.getLogger(UserService.class);

    @Autowired(required = false)
    private UserMapper userMapper;

    public ResultBean selectByPrimaryKey(int id){
        User user = userMapper.selectByPrimaryKey(id);
        logger.info(user.getUsername());
        return ResultBean.ok("select success",user);
    }

    public ResultBean insertSelective(User user){

        user.setRegtime(new Date());
        int i =userMapper.insertSelective(user);
        if (i==1){
            return ResultBean.ok("添加成功!");
        }else {
            return ResultBean.error("添加失败!");
        }

    }
}
