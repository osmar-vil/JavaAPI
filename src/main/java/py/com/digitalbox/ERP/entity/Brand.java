package py.com.digitalbox.ERP.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import py.com.digitalbox.ERP.adapter.StringAdapter;
import py.com.digitalbox.ERP.dto.brand.BrandRequest;

@Table(name = "brands")
@Entity(name = "Brands")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Brand {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String image_url;
    private String slug;

    public Brand (BrandRequest request) {
        name = request.name();
        description = request.description();
        image_url = request.image_url();
        slug = StringAdapter.toSlug(request.name());
    }
}
