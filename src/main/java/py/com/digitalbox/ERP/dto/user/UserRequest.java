package py.com.digitalbox.ERP.dto.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserRequest (
    @NotBlank String name,
    String last_name,
    @Email String email,
    @NotBlank @Size(min = 8, max = 12) String password
) { }