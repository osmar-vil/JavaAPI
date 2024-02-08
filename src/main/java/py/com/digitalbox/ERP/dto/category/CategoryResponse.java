package py.com.digitalbox.ERP.dto.category;

import py.com.digitalbox.ERP.entity.Category;

public record CategoryResponse(
        String name,
        String slug,
        String description
) {
    public CategoryResponse(Category category) {
        this(category.getName(), category.getSlug(), category.getDescription());
    }
}
