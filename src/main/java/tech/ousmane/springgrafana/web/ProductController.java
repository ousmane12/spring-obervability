package tech.ousmane.springgrafana.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;
import tech.ousmane.springgrafana.entities.Product;
import tech.ousmane.springgrafana.model.Post;
import tech.ousmane.springgrafana.repositories.ProductRepository;

import java.util.List;

@RestController
public class ProductController {

    private ProductRepository productRepository;
    private RestClient restClient;

    public ProductController(ProductRepository productRepository,
                             RestClient.Builder restClient) {
        this.productRepository = productRepository;
        this.restClient = restClient
                .baseUrl("https://jsonplaceholder.typicode.com")
                .build();
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    @GetMapping("/posts")
    public List<Post> allPosts(){
        return restClient.get()
                .uri("/posts")
                .retrieve()
                .body(new ParameterizedTypeReference<List<Post>>() {});
    }
}
