package com.kks.exptrack.repository;

import java.util.List;

import com.kks.exptrack.bean.Expense;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Integer> {

  List<Expense> findByFromAccountId(int id);

}
