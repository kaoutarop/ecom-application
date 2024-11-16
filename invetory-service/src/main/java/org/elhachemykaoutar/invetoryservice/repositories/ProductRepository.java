package org.elhachemykaoutar.invetoryservice.repositories;

import org.elhachemykaoutar.invetoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
