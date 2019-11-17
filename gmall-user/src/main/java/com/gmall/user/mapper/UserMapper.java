package com.gmall.user.mapper;

import com.gmall.user.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;
//import org.apache.ibatis.annotations.Mapper;
//import tk.mybatis.mapper.common.Mapper;
//import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface UserMapper extends Mapper<UmsMember> {
    //查询所有用户
    List<UmsMember> selectAllUser();
//    删除用户，注销用户
    public void deleteUserMember(String id);
//    修改用户信息
    public void updateUserMember(UmsMember umsMember);
//    新增用户信息
    public void addUserMember(UmsMember umsMember);
}


