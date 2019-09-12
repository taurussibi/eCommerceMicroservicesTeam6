/**
 * 
 */
package com.eCommerce.price.model;

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
public class Price {

	@Id
	private int productID;

	private int price;

}
