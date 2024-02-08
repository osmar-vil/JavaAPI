package py.com.digitalbox.ERP.dto.business;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record BusinessRequest(
    @NotBlank String name,
    @NotBlank String description,
    @NotBlank String address,
    @NotBlank String work_hours,
    @NotBlank String phone,
    @NotBlank String whatsapp,
    @NotBlank @Email String email
) { }
