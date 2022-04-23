package com.kks.exptrack.service;

import java.util.List;

import com.kks.exptrack.bean.Expense;

public interface ExpenseService {

  public Expense getExpenseById(Integer id);

  public Expense saveExpense(Expense expense);

  public List<Expense> getAllExpenses();

  public List<Expense> saveAll(List<Expense> expenses);

  public List<Expense> findByFromAccountId(int id);

  public void deleteExpense(Expense expense);

  public void deleteExpense(int id);
}
