package com.gmall.user.mapper;

import com.gmall.user.bean.UmsMemberReceiveAddress;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UmsMemberReceiveAddressMapper  extends Mapper<UmsMemberReceiveAddress> {
    //根据用户id查询用户的收货地址
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
    //删除某条收货地址
    public void deleteReceiveAddressById(String id);
    //新增收货地址
    public void addReceiveAddressByMemberId(UmsMemberReceiveAddress umsMemberReceiveAddress);
//    修改用户收货地址
    public void updateUmsMemberReceiveAddressByMemberId(UmsMemberReceiveAddress umsMemberReceiveAddress);
}
