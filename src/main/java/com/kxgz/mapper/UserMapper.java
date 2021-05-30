package com.kxgz.mapper;

import com.kxgz.pojo.User;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;

public interface UserMapper {

    //查询某个用户，使用注解方式
    @Select("select * from tb_user where id=#{id}")
    public User queryById(Long id);

    //新增用户
    @Insert("insert into user (name,birthday,address) values(#{name},#{birthday},#{address})")
    @Options(useGeneratedKeys = true, keyProperty = "id")//自增主键id自动回填
    public void insert(@Param("name") String name,
                       @Param("birthday") Date birthday,
                       @Param("address") String address);
}
