package com.ximi.mybatis.demo.mapper;

import com.ximi.mybatis.demo.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //    获取全部user信息
    List<User> getUserList();

    //    根据id查询user信息
    User getUserById(int id);

    //    根据id删除某个用户
    User deleteUserById(int id);

    //    增加用户
    int addUser(User user);

    //    根据id改变用户信息
    int updateUserById(User user);

    //map
    int addUser2(Map<String, Object> map);

    //    根据limit分页查询数据
    List<User> getUserListByLimit(Map<String, Object> map);

    //    根据rowBounds分页查询
    List<User> getUserListByRowBounds();

}
