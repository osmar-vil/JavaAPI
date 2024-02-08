package py.com.digitalbox.ERP.dto.category;

import jakarta.validation.constraints.NotBlank;

public record CategoryRequest(
    @NotBlank String name,
    String description,
    Long category_id
) { }
