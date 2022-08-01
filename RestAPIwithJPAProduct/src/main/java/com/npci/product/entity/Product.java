package com.npci.product.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name="product")

public class Product {
		
		@Id		// primary key
		//@GeneratedValue(strategy = GenerationType.IDENTITY) // autoIncrement
		@Column(name="id")
		private Integer id;
		
		@Column(name = "sku")
		private String sku;
		
		@Column(name="name")
		private String name;
		
		@Column(name="description")
		private String description;
		
		@Column(name="unitprice")
		private double unitprice;
		
		@Column(name="active")
		private boolean active;
		
		@Column(name="unitsinstock")
		private Integer unitsinstock;
		
		@Column(name="datecreated")
		private Date datecreated;
		
		@Column(name="lastupdated")
		private Date lastupdated;
		
		@Column(name="categoryid")
		private Integer categoryid;
		
		public Product() {}

		public Product(Integer id, String sku, String name, String description, double unitprice, boolean active,Integer unitsinstock, Date datecreated, Date lastupdated, Integer categoryid ) {
			super();
			this.id = id;
			this.sku = sku;
			this.name = name;
			this.description = description;
			this.unitprice = unitprice;
			this.active = active;
			this.unitsinstock = unitsinstock;
			this.datecreated = datecreated;
			this.lastupdated = lastupdated;
			this.categoryid = categoryid;
			
			
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getSku() {
			return sku;
		}

		public void setSku(String sku) {
			this.sku = sku;
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

		public double getUnitprice() {
			return unitprice;
		}

		public void setUnitprice(double unitprice) {
			this.unitprice = unitprice;
		}

		public boolean getActive() {
			return active;
		}

		public void setActivebit(boolean activebit) {
			this.active = active;
		}

		public Integer getUnitsinstock() {
			return unitsinstock;
		}

		public void setUnitsinstock(Integer unitsinstock) {
			this.unitsinstock = unitsinstock;
		}

		public Date getDatecreated() {
			return datecreated;
		}

		public void setDatecreated(Date datecreated) {
			this.datecreated = datecreated;
		}

		public Date getLastupdated() {
			return lastupdated;
		}

		public void setLastupdated(Date lastupdated) {
			this.lastupdated = lastupdated;
		}

		public Integer getCategoryid() {
			return categoryid;
		}

		public void setCategoryid(Integer categoryid) {
			this.categoryid = categoryid;
		}

		}
