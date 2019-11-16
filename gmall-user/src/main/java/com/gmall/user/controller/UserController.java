package com.gmall.user.controller;

import com.gmall.user.bean.UmsMember;
import com.gmall.user.bean.UmsMemberReceiveAddress;
import com.gmall.user.service.UmsMemberReceiveAddressService;
import com.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    UmsMemberReceiveAddressService umsMemberReceiveAddressService;
    @RequestMapping("getReceiveAddressByMemberId")
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddresses;
    }
    @RequestMapping("getAllUsers")
    public List<UmsMember> getAllUsers(){
        List<UmsMember> umsMembers = userService.getAllUsers();
        return umsMembers;
    }
    @RequestMapping("index")
    public String index(){
        return "hello user";
    }
}
