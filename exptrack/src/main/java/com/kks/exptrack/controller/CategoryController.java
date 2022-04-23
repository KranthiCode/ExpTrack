package com.kks.exptrack.controller;

import java.util.List;

import com.kks.exptrack.bean.Category;
import com.kks.exptrack.service.CategoryService;

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

@CrossOrigin
@RestController
@RequestMapping(path = "/categories")
public class CategoryController {
  @Autowired
  CategoryService categoryService;

  @GetMapping
  public List<Category> getAllCategories() {
    // categoryService.getAllCategories().stream().forEach(System.out::println);
    return categoryService.getAllCategories();
  }

  @PostMapping
  public Category saveCategory(@RequestBody Category category) {
    return categoryService.saveCategory(category);
  }

  @GetMapping(path = "/{id}")
  public Category getCategoryById(@PathVariable int id) {
    return categoryService.getCategoryById(id);
  }

  @GetMapping(path = "/test")
  public Category getTestObject() {
    Category c = new Category();
    c.setName("categoryName");
    // c.setParent(null);
    c.setSubCategories(null);
    return c;
  }

  @PutMapping
  public Category updateCategory(@RequestBody Category category) {
    return categoryService.saveCategory(category);
  }

  @DeleteMapping
  public void deleteCategory(@RequestBody Category category) {
    categoryService.deleteCategory(category);
  }

  @DeleteMapping(value = "/{id}")
  public void deleteCategory(@PathVariable String id) {
    categoryService.deleteCategory(Integer.valueOf(id));
  }
}
