package org.elhachemykaoutar.billingservice.repository;

import org.elhachemykaoutar.billingservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductItemRepository extends JpaRepository<ProductItem,Long> {
}
