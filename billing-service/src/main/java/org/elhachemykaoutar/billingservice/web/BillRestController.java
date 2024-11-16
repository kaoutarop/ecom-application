package org.elhachemykaoutar.billingservice.web;

import org.elhachemykaoutar.billingservice.entities.Bill;
import org.elhachemykaoutar.billingservice.repository.BillRepository;
import org.elhachemykaoutar.billingservice.repository.ProductItemRepository;
import org.elhachemykaoutar.billingservice.services.CustomerRestClient;
import org.elhachemykaoutar.billingservice.services.ProductRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillRestController {
    @Autowired
    private BillRepository billRepository;
    @Autowired
    private ProductItemRepository productItemRepository;
    @Autowired
    private CustomerRestClient customerRestClient;
    @Autowired
    private ProductRestClient productRestClient;


    @GetMapping("/fullBill/{id}")
    public Bill bill(@PathVariable Long id){
    Bill bill=billRepository.findById(id).get();
    bill.setCustomer(customerRestClient.findCustomerById(bill.getCustomerId()));
    bill.getProductItems().forEach(pi->{
        pi.setProduct(productRestClient.findProductById(pi.getProductId()));

    });
    return bill;

    }
}
