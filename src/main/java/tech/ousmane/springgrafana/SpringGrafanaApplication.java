package tech.ousmane.springgrafana;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tech.ousmane.springgrafana.entities.Product;
import tech.ousmane.springgrafana.repositories.ProductRepository;

@SpringBootApplication
public class SpringGrafanaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringGrafanaApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args -> {
            productRepository.save(Product.builder().name("Earphone").price(2000).build());
            productRepository.save(Product.builder().name("iPhone").price(20000).build());
            productRepository.save(Product.builder().name("Charger").price(3000).build());
            productRepository.findAll().forEach(System.out::println);
        };
    }

}
