package com.wzq.service;

import com.wzq.domain.Account;

import java.util.List;

public interface AccountService {
    // 查询所有账户
     List<Account> findAll();

    // 保存帐户信息
     void saveAccount(Account account);
}
