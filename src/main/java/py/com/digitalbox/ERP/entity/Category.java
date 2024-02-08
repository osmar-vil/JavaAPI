package py.com.digitalbox.ERP.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import py.com.digitalbox.ERP.adapter.StringAdapter;
import py.com.digitalbox.ERP.dto.category.CategoryRequest;

@Table(name = "categories")
@Entity(name = "Categories")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Category {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String slug;
    private String description;
    private Long category_id;

    public Category(CategoryRequest request) {
        name = request.name();
        slug = StringAdapter.toSlug(request.name());
        description = request.description();
        category_id = request.category_id();
    }
}
