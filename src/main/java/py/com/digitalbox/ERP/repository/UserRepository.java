package py.com.digitalbox.ERP.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import py.com.digitalbox.ERP.entity.User;

public interface UserRepository extends JpaRepository<User, Long> { }
