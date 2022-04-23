package com.kks.exptrack.service;

import java.util.List;

import com.kks.exptrack.bean.Account;

public interface AccountService {

  public Account getAccountById(Integer id);

  public Account saveAccount(Account account);

  public List<Account> getAllAccoutns();

  public List<Account> saveAll(List<Account> accounts);

  public void deleteAccount(Account account);

  public void deleteAccount(int accountId);

}
