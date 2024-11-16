package org.elhachemykaoutar.billingservice.repository;

import org.elhachemykaoutar.billingservice.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill,Long> {

}
