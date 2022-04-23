package com.kks.exptrack.service;

import java.util.List;

import com.kks.exptrack.bean.SubCategory;
import com.kks.exptrack.repository.SubCategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubCategoryServiceImpl implements SubCategoryService {

  @Autowired
  public SubCategoryRepository repository;

  @Override
  public SubCategory getSubCategoryById(Integer id) {
    return repository.getById(id);
  }

  @Override
  public SubCategory saveSubCategory(SubCategory subCategory) {
    return repository.save(subCategory);
  }

  @Override
  public List<SubCategory> getAllSubCategories() {
    return repository.findAll();
  }

  @Override
  public List<SubCategory> saveAll(List<SubCategory> subCategories) {
    return repository.saveAll(subCategories);
  }

  @Override
  public void deleteSubCategory(SubCategory subCategory) {
    repository.delete(subCategory);
  }

  @Override
  public void deleteSubCategory(int id) {
    repository.deleteById(id);
  }

}
