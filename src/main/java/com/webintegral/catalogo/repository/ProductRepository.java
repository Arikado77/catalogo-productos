package com.webintegral.catalogo.repository;

import com.webintegral.catalogo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}