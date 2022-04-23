package com.kks.exptrack.repository;

import com.kks.exptrack.bean.Income;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeRepository extends JpaRepository<Income, Integer> {

}
