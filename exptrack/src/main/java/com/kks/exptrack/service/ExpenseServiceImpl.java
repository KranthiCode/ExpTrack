package com.kks.exptrack.service;

import java.util.List;

import com.kks.exptrack.bean.Expense;
import com.kks.exptrack.repository.ExpenseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseServiceImpl implements ExpenseService {

  @Autowired
  private ExpenseRepository repository;

  @Override
  public Expense getExpenseById(Integer id) {
    return repository.getById(id);
  }

  @Override
  public Expense saveExpense(Expense expense) {
    return repository.save(expense);
  }

  @Override
  public List<Expense> getAllExpenses() {
    return repository.findAll();
  }

  @Override
  public List<Expense> saveAll(List<Expense> expenses) {
    return repository.saveAll(expenses);
  }

  @Override
  public List<Expense> findByFromAccountId(int id) {
    return repository.findByFromAccountId(id);
  }

  @Override
  public void deleteExpense(Expense expense) {
    repository.delete(expense);
  }

  @Override
  public void deleteExpense(int id) {
    repository.deleteById(id);
  }

}
