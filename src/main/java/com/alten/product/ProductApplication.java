package com.alten.product;

import com.alten.product.model.InventoryStatus;
import com.alten.product.model.Product;
import com.alten.product.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class ProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}

	@Bean
	CommandLineRunner init(ProductRepository repository) {
		return args -> {
			repository.save(new Product("P001", "Laptop", "High-end gaming laptop", "image1.jpg", "Electronics", 1500, 10, "REF001", 1L, InventoryStatus.INSTOCK, 4.5f));
			repository.save(new Product("P002", "Smartphone", "Latest model smartphone", "image2.jpg", "Electronics", 800, 20, "REF002", 2L, InventoryStatus.INSTOCK, 4.2f));
			repository.save(new Product("P003", "Headphones", "Noise-cancelling headphones", "image3.jpg", "Accessories", 200, 15, "REF003", 3L, InventoryStatus.INSTOCK, 4.7f));
			repository.save(new Product("P004", "Smartwatch", "Feature-packed smartwatch", "image4.jpg", "Wearables", 300, 8, "REF004", 4L, InventoryStatus.OUTOFSTOCK, 4.1f));
			repository.save(new Product("P005", "Tablet", "10-inch display tablet", "image5.jpg", "Electronics", 400, 5, "REF005", 5L, InventoryStatus.INSTOCK, 4.0f));
			repository.save(new Product("P006", "Camera", "Professional DSLR camera", "image6.jpg", "Photography", 1200, 6, "REF006", 6L, InventoryStatus.LOWSTOCK, 4.6f));
			repository.save(new Product("P007", "Keyboard", "Mechanical keyboard", "image7.jpg", "Accessories", 100, 25, "REF007", 7L, InventoryStatus.INSTOCK, 4.8f));
			repository.save(new Product("P008", "Monitor", "4K Ultra HD monitor", "image8.jpg", "Electronics", 600, 12, "REF008", 8L, InventoryStatus.INSTOCK, 4.4f));
			repository.save(new Product("P009", "Printer", "All-in-one wireless printer", "image9.jpg", "Office Supplies", 150, 9, "REF009", 9L, InventoryStatus.LOWSTOCK, 4.3f));
			repository.save(new Product("P010", "Mouse", "Wireless ergonomic mouse", "image10.jpg", "Accessories", 50, 30, "REF010", 10L, InventoryStatus.INSTOCK, 4.9f));
		};
	}
}
