package com.kks.exptrack.service;

import java.util.List;

import com.kks.exptrack.bean.Income;
import com.kks.exptrack.repository.IncomeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IncomeServiceImpl implements IncomeService {

  @Autowired
  private IncomeRepository repository;

  @Override
  public Income getIncomeById(Integer id) {
    return repository.getById(id);
  }

  @Override
  public Income saveIncome(Income income) {
    return repository.save(income);
  }

  @Override
  public List<Income> getAllIncomes() {
    return repository.findAll();
  }

  @Override
  public List<Income> saveAll(List<Income> incomes) {
    return repository.saveAll(incomes);
  }

  @Override
  public void deleteIncome(Income income) {
    repository.delete(income);
  }

  @Override
  public void deleteIncome(int id) {
    repository.deleteById(id);
  }

}
