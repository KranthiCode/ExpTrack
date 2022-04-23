package com.kks.exptrack.controller;

import java.util.List;

import com.kks.exptrack.bean.Account;
import com.kks.exptrack.service.AccountServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@CrossOrigin
@RequestMapping(path = "/accounts")
public class AccountController {
  @Autowired
  AccountServiceImpl accountService;

  @GetMapping
  public List<Account> getAllAccounts() {
    return accountService.getAllAccoutns();
  }

  @GetMapping("/{id}")
  public Account getAccountById(@PathVariable String id) {
    return accountService.getAccountById(Integer.valueOf(id));
  }

  @PostMapping
  public Account saveAccount(@RequestBody Account account) {
    account.setCurrentBalance(account.getOpeningBalance());
    return accountService.saveAccount(account);
  }

  @PutMapping
  public Account putMethodName(@RequestBody Account account) {
    return accountService.saveAccount(account);
  }

  @DeleteMapping
  public void deleteAccount(@RequestBody Account account) {
    accountService.deleteAccount(account);
  }

  @DeleteMapping(value = "/{id}")
  public void deleteAccountById(@PathVariable String id) {
    accountService.deleteAccount(Integer.valueOf(id));
  }

}
