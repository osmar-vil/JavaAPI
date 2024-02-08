package py.com.digitalbox.ERP.dto.brand;

import jakarta.validation.constraints.NotBlank;

public record BrandRequest(
    @NotBlank String name,
    String description,
    String image_url
) { }
