package com.wzq.dao;

import com.wzq.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountDao {

    // 查询所有账户
    //@Select("select * from account")
    List<Account> findAll();

    // 保存帐户信息
    //@Insert("insert into account (name,money) values (#{name},#{money})")
   void saveAccount(Account account);
}
