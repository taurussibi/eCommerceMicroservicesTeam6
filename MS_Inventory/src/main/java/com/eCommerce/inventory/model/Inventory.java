/**
 * 
 */
package com.eCommerce.inventory.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Team 6
 *
 */
@Entity
@Getter
@Setter
public class Inventory {
	
	@Id
	private int productID;
	
	private int quantity;
	
	private String supplierDetails;

}
