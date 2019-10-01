package com.zensar.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Gayatri Sinnarkar
 * @creation_date 1st October 2019 10:13AM
 * @modification_date 1st October 2019 10:13AM
 * @version 1.0
 * @copyright Zensar Technologies
 * @description It is a POJO class.
 * 				It is a persistence class.
 *
 */
@Entity
public class Product 
{	
	@Id
	@Column(name="id")
	private int productId;
	private String name;
	private String brand;
	private float price;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	
	
}
