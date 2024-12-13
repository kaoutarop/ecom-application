package org.elhachemykaoutar.invetoryservice;

import org.elhachemykaoutar.invetoryservice.entities.Product;
import org.elhachemykaoutar.invetoryservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.List;

@SpringBootApplication
public class InvetoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InvetoryServiceApplication.class, args);

    }
    @Bean
    CommandLineRunner start(ProductRepository productRepository, RepositoryRestConfiguration restConfiguration)
    {
        return args -> {
            restConfiguration.exposeIdsFor(Product.class);
            productRepository.saveAll(
                    List.of(
                            Product.builder().name("Computer").quantity(12).price(1200).build(),
                            Product.builder().name("Printer").quantity(32).price(120).build(),
                            Product.builder().name("Smartphone").quantity(31).price(900).build(),
                            Product.builder().name("Tablet").quantity(25).price(500).build(),
                            Product.builder().name("Headphones").quantity(50).price(80).build(),
                            Product.builder().name("Keyboard").quantity(40).price(45).build(),
                            Product.builder().name("Mouse").quantity(60).price(25).build(),
                            Product.builder().name("Monitor").quantity(20).price(300).build(),
                            Product.builder().name("Laptop").quantity(15).price(1500).build()


                    )
            );
        };
    }

}
