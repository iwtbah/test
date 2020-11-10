package com.zwz521.service.impl;

import com.zwz521.domain.Account;
import com.zwz521.mapper.AccountMapper;
import com.zwz521.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 赵文卓
 * @version 1.0
 * @date 2020/11/1 14:17
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper mapper;

    @Override
    public void save(Account account) {
        mapper.save(account);
    }

    @Override
    public List<Account> findAll() {
        List<Account> accountList = mapper.findAll();
        return accountList;
    }
}
