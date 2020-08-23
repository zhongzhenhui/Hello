package com.zzh.springboot.web;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zzh.springboot.dao.ProductDAO;
import com.zzh.springboot.pojo.Product;

@RestController 
public class Controllers {
	@Autowired
	ProductDAO dao;
	
	@GetMapping("/products/{id}")
	public Product getOne(Product p) {
		return dao.selectOne(p.getId());	
	}
	
	@PostMapping("/products/{name}")
	public String insertProduct(Product p) {
		System.out.println(dao.addProduct(p));
		return "insert";
	}
	
	@PutMapping("/products/{id}/{name}")
	public String updateProduct(Product p) {
		
		System.out.println(dao.updateProduct(p));
		return "upddate";
	}
	
	@DeleteMapping("/products/{id}")
	public String deleteProduct(@PathVariable int id) {
		System.out.println(dao.deleteProduct(id));
		return "delete";
	}
}
