package py.com.digitalbox.ERP.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import py.com.digitalbox.ERP.entity.Business;

public interface BusinessRepository extends JpaRepository<Business, Long> { }
