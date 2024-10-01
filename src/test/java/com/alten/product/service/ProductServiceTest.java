package com.alten.product.service;

import com.alten.product.model.InventoryStatus;
import com.alten.product.model.Product;
import com.alten.product.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class ProductServiceTest {

    @InjectMocks
    private ProductService productService;

    @Mock
    private ProductRepository productRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetProductById() {
        Product product = new Product("P001", "Laptop", "High-end laptop", "image1.jpg", "Electronics", 1500.00, 10, "REF001", 1L, InventoryStatus.INSTOCK, 4.95);
        product.setId(1L);
        when(productRepository.findById(1L)).thenReturn(Optional.of(product));

        Optional<Product> result = productService.getProductById(1L);

        assertTrue(result.isPresent());
        assertEquals(product.getName(), result.get().getName());
        verify(productRepository, times(1)).findById(1L);
    }

    @Test
    void testGetAllProducts() {
        Product product1 = new Product("P001", "Laptop", "High-end laptop", "image1.jpg", "Electronics", 1500.00, 10, "REF001", 1L, InventoryStatus.INSTOCK, 4.5);
        Product product2 = new Product("P002", "Smartphone", "Latest smartphone", "image2.jpg", "Electronics", 800.00, 20, "REF002", 2L, InventoryStatus.LOWSTOCK, 4.2);

        product1.setId(1L);
        product2.setId(2L);

        when(productRepository.findAll()).thenReturn(Arrays.asList(product1, product2));

        List<Product> products = productService.getAllProducts();

        assertEquals(2, products.size());
        verify(productRepository, times(1)).findAll();
    }
}
