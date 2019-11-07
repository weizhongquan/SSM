package com.wzq.controller;

import com.wzq.domain.Account;
import com.wzq.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Resource
    private AccountService accountService;
    @RequestMapping("/getList")
    public String getList(Model model) {
        List<Account> list = accountService.findAll();
        model.addAttribute("list", list);
        return "list";
    }
}
