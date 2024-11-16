package org.elhachemykaoutar.billingservice.entities;

import jakarta.persistence.*;
import lombok.*;
import org.elhachemykaoutar.billingservice.model.Customer;

import java.util.Currency;
import java.util.Date;
import java.util.List;
@Entity
@Data
@AllArgsConstructor @NoArgsConstructor @Builder
public class Bill {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date billDate;
    private Long customerId;
    @OneToMany(mappedBy = "bill")
    private List<ProductItem> productItems;
    @Transient
    private Customer customer;
}
