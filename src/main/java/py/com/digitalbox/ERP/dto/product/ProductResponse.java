package py.com.digitalbox.ERP.dto.product;

import py.com.digitalbox.ERP.entity.Product;

public record ProductResponse(
        String code,
        String reference,
        String name,
        String slug,
        String description
) {
    public ProductResponse(Product product) {
        this(
                product.getCode(),
                product.getReference(),
                product.getName(),
                product.getSlug(),
                product.getDescription()
        );
    }
}
