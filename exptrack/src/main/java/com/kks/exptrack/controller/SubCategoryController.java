package com.kks.exptrack.controller;

import java.util.Set;

import com.kks.exptrack.bean.Category;
import com.kks.exptrack.bean.SubCategory;
import com.kks.exptrack.service.CategoryService;
import com.kks.exptrack.service.SubCategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(path = "/categories/{parentId}/subcategories")
public class SubCategoryController {

  @Autowired
  private SubCategoryService subCategoryService;

  @Autowired
  private CategoryService categoryService;

  @GetMapping
  public Set<SubCategory> getAllSubCategories(@PathVariable int parentId) {
    return categoryService.getCategoryById(parentId).getSubCategories();
  }

  @PostMapping
  public SubCategory saveSubCategory(@PathVariable int parentId, @RequestBody SubCategory subCategory) {
    Category c = categoryService.getCategoryById(parentId);
    subCategory.setCategory(c);
    return subCategoryService.saveSubCategory(subCategory);
  }

  @PutMapping
  public SubCategory updateSubCategory(@RequestBody SubCategory subCategory) {
    return subCategoryService.saveSubCategory(subCategory);
  }

  @DeleteMapping
  public void deleteSubCategory(@RequestBody SubCategory subCategory) {
    subCategoryService.deleteSubCategory(subCategory);
  }

  @DeleteMapping(value = "/{id}")
  public void deleteSubCategory(@PathVariable String id) {
    subCategoryService.deleteSubCategory(Integer.valueOf(id));
  }
}
