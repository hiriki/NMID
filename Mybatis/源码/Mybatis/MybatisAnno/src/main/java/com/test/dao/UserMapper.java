package com.test.dao;

import com.test.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Select("select * from Mybatis.user")
    List<User> getUsers();

    // 方法存在多个参数，所有的参数前面必须加上 @Param("id")注解
    @Select("select * from user where id = #{id}")
    User getUserByID(@Param("id") int id);

    @Insert("insert into user(id,name,password) values (#{id},#{name},#{password})")
    int addUser(User user);

    @Update("update user set name=#{name},password=#{password} where id = #{id}")
    int updateUser(User user);

    @Delete("delete from user where id = #{uid}")
     int deleteUser(@Param("uid") int id);

}
