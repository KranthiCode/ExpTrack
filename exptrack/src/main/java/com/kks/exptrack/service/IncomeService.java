package com.kks.exptrack.service;

import java.util.List;

import com.kks.exptrack.bean.Income;

public interface IncomeService {

  public Income getIncomeById(Integer id);

  public Income saveIncome(Income income);

  public List<Income> getAllIncomes();

  public List<Income> saveAll(List<Income> incomes);

  public void deleteIncome(Income income);

  public void deleteIncome(int id);
}
