package com.wilson.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ProductEntity {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Double price;
	private Integer quantity;

}
