package py.com.digitalbox.ERP.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import py.com.digitalbox.ERP.adapter.StringAdapter;
import py.com.digitalbox.ERP.dto.product.ProductRequest;

@Table(name = "products")
@Entity(name = "Products")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String reference;
    private String name;
    private String slug;
    private String description;
    private Long brand_id;
    private Long category_id;

    public Product (ProductRequest request) {
        code = request.code();
        reference = request.reference();
        name = request.name();
        slug = StringAdapter.toSlug(request.name());
        description = request.description();
        brand_id = request.brand_id();
        category_id = request.category_id();
    }
}
