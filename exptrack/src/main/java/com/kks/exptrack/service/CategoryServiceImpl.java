package com.kks.exptrack.service;

import java.util.List;

import com.kks.exptrack.bean.Category;
import com.kks.exptrack.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

  @Autowired
  private CategoryRepository repository;

  @Override
  public Category getCategoryById(Integer id) {
    return repository.getById(id);
  }

  @Override
  public Category saveCategory(Category category) {
    return repository.save(category);
  }

  @Override
  public List<Category> getAllCategories() {
    return repository.findAll();
  }

  @Override
  public List<Category> saveAll(List<Category> categories) {
    return repository.saveAll(categories);
  }

  @Override
  public void deleteCategory(Category category) {
    repository.delete(category);
  }

  @Override
  public void deleteCategory(int id) {
    repository.deleteById(id);
  }

}
