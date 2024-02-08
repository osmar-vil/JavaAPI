package py.com.digitalbox.ERP.dto.brand;

import py.com.digitalbox.ERP.entity.Brand;

public record BrandResponse(
        String name,
        String description,
        String image_url,
        String slug
) {
    public BrandResponse (Brand brand) {
        this(brand.getName(), brand.getDescription(), brand.getImage_url(), brand.getSlug());
    }
}
