package com.alten.product.mapper;

import com.alten.product.dto.ProductDTO;
import com.alten.product.model.Product;

public class ProductMapper {

    public static Product mapProductDtoToProduct(ProductDTO productDTO) {
        Product product = new Product();
        product.setCode(productDTO.getCode());
        product.setName(productDTO.getName());
        product.setDescription(productDTO.getDescription());
        product.setImage(productDTO.getImage());
        product.setCategory(productDTO.getCategory());
        product.setPrice(productDTO.getPrice());
        product.setQuantity(productDTO.getQuantity());
        product.setInternalReference(productDTO.getInternalReference());
        product.setShellId(productDTO.getShellId());
        product.setInventoryStatus(productDTO.getInventoryStatus());
        product.setRating(productDTO.getRating());
        return product;
    }
}
