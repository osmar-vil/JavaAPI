package py.com.digitalbox.ERP.dto.product;

import jakarta.validation.constraints.NotBlank;

public record ProductRequest(
        String code,
        String reference,
        @NotBlank String name,
        String description,
        Long brand_id,
        Long category_id
) {
}
