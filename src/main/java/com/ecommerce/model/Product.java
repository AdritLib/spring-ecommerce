package com.ecommerce.model;

public class Product {
	private Integer id;
	private String name;
	private String description;
	private String img;
	private double precio;
	private int amount;
	
	public Product() {
	}
	
	public Product(Integer id, String name, String description, String img, double precio, int amount) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.img = img;
		this.precio = precio;
		this.amount = amount;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", img=" + img + ", precio="
				+ precio + ", amount=" + amount + "]";
	}
}
