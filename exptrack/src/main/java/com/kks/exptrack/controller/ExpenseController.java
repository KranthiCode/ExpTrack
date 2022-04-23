package com.kks.exptrack.controller;

import java.time.Instant;
import java.util.List;

import com.kks.exptrack.bean.Expense;
import com.kks.exptrack.service.AccountService;
import com.kks.exptrack.service.ExpenseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(path = "/accounts/{accountId}/expenses")
public class ExpenseController {

  @Autowired
  ExpenseService expenseService;

  @Autowired
  AccountService accountService;

  @GetMapping
  public List<Expense> getAllExpenses(@PathVariable int accountId) {
    return expenseService.findByFromAccountId(accountId);
  }

  @GetMapping("/{id}")
  public Expense getExpense(@PathVariable int id) {
    // return expenseService.getExpenseById(Integer.valueOf(id));
    return expenseService.getExpenseById(id);
  }

  @PostMapping
  public Expense saveExpense(@PathVariable int accountId, @RequestBody Expense expense) {
    expense.setFromAccount(accountService.getAccountById(accountId));
    expense.setDate(Instant.now());
    return expenseService.saveExpense(expense);
  }

  @GetMapping(path = "/test")
  public Expense testExpense() {
    return new Expense();
  }

  @PutMapping
  public Expense updateExpense(@RequestBody Expense expense) {
    return expenseService.saveExpense(expense);
  }

  @DeleteMapping
  public void deleteExpense(@RequestBody Expense expense) {
    expenseService.deleteExpense(expense);
  }

  @DeleteMapping(value = "/{id}")
  public void deleteExpense(@PathVariable String id) {
    expenseService.deleteExpense(Integer.valueOf(id));
  }
}
