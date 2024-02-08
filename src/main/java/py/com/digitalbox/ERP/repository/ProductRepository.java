package py.com.digitalbox.ERP.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import py.com.digitalbox.ERP.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
