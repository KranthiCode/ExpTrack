package com.kks.exptrack.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "Account")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Account {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String name;
  private double openingBalance;
  private double currentBalance;
  private String type;

  @JsonIgnore
  @OneToMany(mappedBy = "fromAccount")
  private List<Expense> expenses = new ArrayList<>();

  @JsonIgnore
  @OneToMany(mappedBy = "toAccount")
  private List<Income> incomes = new ArrayList<>();

  /**
   * @return int return the id
   */
  public int getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * @return String return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return double return the openingBalance
   */
  public double getOpeningBalance() {
    return openingBalance;
  }

  /**
   * @param openingBalance the openingBalance to set
   */
  public void setOpeningBalance(double openingBalance) {
    this.openingBalance = openingBalance;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * @return Set<Expense> return the expenses
   */
  public List<Expense> getExpenses() {
    return expenses;
  }

  /**
   * @param expenses the expenses to set
   */
  public void setExpenses(List<Expense> expenses) {
    this.expenses = expenses;
  }

  /**
   * @return Set<Income> return the incomes
   */
  public List<Income> getIncomes() {
    return incomes;
  }

  /**
   * @param incomes the incomes to set
   */
  public void setIncomes(List<Income> incomes) {
    this.incomes = incomes;
  }

  public double getCurrentBalance() {
    return currentBalance;
  }

  public void setCurrentBalance(double currentBalance) {
    this.currentBalance = currentBalance;
  }

}
