package com.kks.exptrack.bean;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "Income")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Income {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private double amount;
  private Instant date;
  private String description;

  @ManyToOne
  @JoinColumn(name = "fk_account_id", referencedColumnName = "id")
  private Account toAccount;

  @OneToOne
  @JoinColumn(name = "fk_category_id", referencedColumnName = "id")
  private Category category;

  @OneToOne
  @JoinColumn(name = "fk_sub_category_id", referencedColumnName = "id")
  private SubCategory subCategory;

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
   * @return double return the amount
   */
  public double getAmount() {
    return amount;
  }

  /**
   * @param amount the amount to set
   */
  public void setAmount(double amount) {
    this.amount = amount;
  }

  /**
   * @return Instant return the date
   */
  public Instant getDate() {
    return date;
  }

  /**
   * @param date the date to set
   */
  public void setDate(Instant date) {
    this.date = date;
  }

  /**
   * @return Account return the toAccount
   */
  public Account getToAccount() {
    return toAccount;
  }

  /**
   * @param toAccount the toAccount to set
   */
  public void setToAccount(Account toAccount) {
    this.toAccount = toAccount;
  }

  /**
   * @return String return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * @param description the description to set
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * @return Category return the category
   */
  public Category getCategory() {
    return category;
  }

  /**
   * @param category the category to set
   */
  public void setCategory(Category category) {
    this.category = category;
  }

  public SubCategory getSubCategory() {
    return subCategory;
  }

  public void setSubCategory(SubCategory subCategory) {
    this.subCategory = subCategory;
  }

}
