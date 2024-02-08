package py.com.digitalbox.ERP.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import py.com.digitalbox.ERP.dto.user.UserRequest;

@Table(name = "users")
@Entity(name = "Users")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String last_name;
    private String email;
    private String password;

    public User (UserRequest request) {
        name = request.name();
        last_name = request.last_name();
        email = request.email();
        password = request.password();
    }
}
