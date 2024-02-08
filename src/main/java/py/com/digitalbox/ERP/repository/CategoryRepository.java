package py.com.digitalbox.ERP.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import py.com.digitalbox.ERP.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> { }
