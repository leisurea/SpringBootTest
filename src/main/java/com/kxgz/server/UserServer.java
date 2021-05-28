package com.kxgz.server;

import com.kxgz.mapper.UserMapper;
import com.kxgz.pojo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 点击类名，按住cont+shif+T,可以快速创建测试类
 */
@Service
public class UserServer {

    @Autowired//如果要允许null值(required=false)
    private  UserMapper userMapper;
    //根据ID查询
    public User queryById(Long id) {
        return userMapper.queryById(id);
    }


    //保存新增用户
    @Transactional//事务注解-多个表操作有失败就会回滚
    public void saveUser(User user) {
        System.out.println("新增用户。。");
    }

}
