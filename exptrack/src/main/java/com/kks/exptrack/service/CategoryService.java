package com.kks.exptrack.service;

import java.util.List;

import com.kks.exptrack.bean.Category;

public interface CategoryService {

  public Category getCategoryById(Integer id);

  public Category saveCategory(Category category);

  public List<Category> getAllCategories();

  public List<Category> saveAll(List<Category> categories);

  public void deleteCategory(Category category);

  public void deleteCategory(int id);

}
