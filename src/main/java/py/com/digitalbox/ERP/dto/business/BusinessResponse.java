package py.com.digitalbox.ERP.dto.business;

import py.com.digitalbox.ERP.entity.Business;

public record BusinessResponse(
        String name,
        String description,
        String address,
        String work_hours,
        String phone,
        String whatsapp,
        String email
) {
    public BusinessResponse(Business business) {
        this(
            business.getName(),
            business.getDescription(),
            business.getAddress(),
            business.getWork_hours(),
            business.getPhone(),
            business.getWhatsapp(),
            business.getEmail()
        );
    }
}
