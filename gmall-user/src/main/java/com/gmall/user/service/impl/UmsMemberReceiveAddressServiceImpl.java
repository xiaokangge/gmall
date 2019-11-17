package com.gmall.user.service.impl;

import com.gmall.user.bean.UmsMemberReceiveAddress;
import com.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.gmall.user.service.UmsMemberReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UmsMemberReceiveAddressServiceImpl implements UmsMemberReceiveAddressService {
    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;
    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        return umsMemberReceiveAddressMapper.getReceiveAddressByMemberId("1");
    }
}
