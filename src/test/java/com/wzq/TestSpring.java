package com.wzq;

import com.wzq.domain.Account;
import com.wzq.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring {

    @Test
    public void run(){
        // 加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        // 获取对象
        AccountService as = ac.getBean("accountService",AccountService.class);
        // 调用方法
      as.findAll();
    }
}
