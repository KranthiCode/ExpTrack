package com.kks.exptrack.controller;

import java.util.List;

import com.kks.exptrack.bean.Income;
import com.kks.exptrack.service.IncomeService;

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
@RequestMapping(path = "/accounts/{accountId}/incomes")
public class IncomeController {
  @Autowired
  private IncomeService incomeService;

  @GetMapping
  public List<Income> getAllIncomes() {
    return incomeService.getAllIncomes();
  }

  @GetMapping(value = "/{id}")
  public Income getIncome(@PathVariable int id) {
    return incomeService.getIncomeById(id);
  }

  @PostMapping
  public Income saveIncome(@RequestBody Income income) {
    return incomeService.saveIncome(income);
  }

  @PutMapping
  public Income updateIncome(@RequestBody Income income) {
    return incomeService.saveIncome(income);
  }

  @DeleteMapping
  public void deleteIncome(@RequestBody Income income) {
    incomeService.deleteIncome(income);
  }

  @DeleteMapping(value = "/{id}")
  public void deleteIncome(@PathVariable String id) {
    incomeService.deleteIncome(Integer.valueOf(id));
  }
}
