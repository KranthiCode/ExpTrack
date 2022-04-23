package com.kks.exptrack.service;

import java.util.List;

import com.kks.exptrack.bean.Account;
import com.kks.exptrack.repository.AccountRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

  @Autowired
  private AccountRepository repository;

  @Override
  public Account getAccountById(Integer id) {
    return repository.getById(id);
  }

  @Override
  public Account saveAccount(Account account) {
    return repository.save(account);
  }

  @Override
  public List<Account> getAllAccoutns() {
    return repository.findAll();
  }

  @Override
  public List<Account> saveAll(List<Account> accounts) {
    return repository.saveAll(accounts);
  }

  @Override
  public void deleteAccount(Account account) {
    repository.delete(account);
  }

  @Override
  public void deleteAccount(int accountId) {
    repository.deleteById(accountId);
  }

}
