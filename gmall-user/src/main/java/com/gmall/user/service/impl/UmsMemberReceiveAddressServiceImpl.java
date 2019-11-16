package com.gmall.user.service.impl;

import com.gmall.user.bean.UmsMemberReceiveAddress;
import com.gmall.user.service.UmsMemberReceiveAddressService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UmsMemberReceiveAddressServiceImpl implements UmsMemberReceiveAddressService {
    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        return null;
    }
}
