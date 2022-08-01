package com.npci.product.entity;



import javax.persistence.Column;
import javax.persistence.Entity;import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="productcategory")

public class ProductCategory {

	@Id			// primary key
	@Column(name="categoryid")
	private Integer categoryid;
	
	@Column(name="categoryname")
	private String categoryname;
	
	public ProductCategory() {}
	

	public ProductCategory(Integer categoryid, String categoryname) {
		super();
		this.categoryname = categoryname;
		this.categoryid = categoryid;
		
	}


	public Integer getCategoryid() {
		return categoryid;
	}


	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}


	public String getCategoryname() {
		return categoryname;
	}


	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	
	
}