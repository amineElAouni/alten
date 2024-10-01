package com.alten.product.dto;

import com.alten.product.model.InventoryStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class ProductDTO {

    @Schema(description = "Code of the product", example = "P020")
    private String code;

    @Schema(description = "Name of the product", example = "Monitor")
    private String name;

    @Schema(description = "Description of the product", example = "4K Ultra HD monitor")
    private String description;

    @Schema(description = "Image URL or filename of the product", example = "img85.png")
    private String image;

    @Schema(description = "Category of the product", example = "Electronics")
    private String category;

    @Schema(description = "Price of the product", example = "5000.00")
    private double price;

    @Schema(description = "Quantity of the product in stock", example = "10")
    private int quantity;

    @Schema(description = "Internal reference of the product", example = "REF001")
    private String internalReference;

    @Schema(description = "Shell ID of the product", example = "20")
    private Long shellId;

    @Schema(description = "Inventory status of the product", example = "INSTOCK")
    private InventoryStatus inventoryStatus;

    @Schema(description = "Rating of the product", example = "4.8")
    private double rating;
}
