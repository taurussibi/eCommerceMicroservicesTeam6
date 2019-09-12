/**
 * 
 */
package com.eCommerce.promotion.model;

import java.sql.Timestamp;

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
public class Promotion {

	@Id
	private int productID;

	private int promotion1;

	private int promotion2;

	private int promotion3;

	private Timestamp startDate;

	private Timestamp endDate;

}
