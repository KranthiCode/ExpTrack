package com.kks.exptrack.service;

import java.util.List;

import com.kks.exptrack.bean.SubCategory;

public interface SubCategoryService {

  public SubCategory getSubCategoryById(Integer id);

  public SubCategory saveSubCategory(SubCategory subCategory);

  public List<SubCategory> getAllSubCategories();

  public List<SubCategory> saveAll(List<SubCategory> subCategories);

  public void deleteSubCategory(SubCategory subCategory);

  public void deleteSubCategory(int id);
}
