/**
 * 
 */
package com.eCommerce.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eCommerce.product.model.Product;

/**
 * @author Team 6
 *
 */
@Repository
public interface ProductCRUDRepository extends JpaRepository<Product, Integer> {

}
