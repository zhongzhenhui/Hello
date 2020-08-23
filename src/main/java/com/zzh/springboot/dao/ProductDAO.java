package com.zzh.springboot.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.zzh.springboot.pojo.Product;

@Mapper
public interface  ProductDAO {
	@Insert("insert into product_ (name) values (#{name})")
	public int addProduct(Product p);
	@Delete("delete from product_ where id=#{id}")
	public int deleteProduct(int id);
	@Update("update product_ set name=#{name} where id=#{id}")
	public int updateProduct(Product p);
	@Select("select * from product_ where id=#{id}")
	public Product selectOne(int id);
}
