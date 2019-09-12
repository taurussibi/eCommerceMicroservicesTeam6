/**
 * 
 */
package com.eCommerce.product.model;

import java.sql.Timestamp;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Team 6
 *
 */
@Entity
@Getter
@Setter
public class Product {
	
	private int productID;
	
	private String productName;
	
	private String productCode;
	
	private String productDescrpt;
	
	private Timestamp productAddedon;
	

}
