package com.zwz521.service;

import com.zwz521.domain.Account;

import java.util.List;

/**
 * @author 赵文卓
 * @version 1.0
 * @date 2020/11/1 14:16
 */
public interface AccountService {

    public void save(Account account);

    public List<Account> findAll();
}
