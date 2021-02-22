package com.shawn.mltravel.mapper;

import com.shawn.mltravel.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {

    int addUser(User user);

    int deleteUser(int id);

    int updateUser(User user);

    User queryUserById(int id);

    List<User> queryUserList();


}
