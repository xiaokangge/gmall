package com.gmall.user.mapper;

import com.gmall.user.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;
//import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//@Mapper
public interface UserMapper extends Mapper<UmsMember> {
    //查询所有用户
    List<UmsMember> selectAllUser();
//    删除用户，注销用户
//    修改用户信息
//    新增用户信息
}


