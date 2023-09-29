package com.example.products.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.products.models.ProductModel;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {

}
