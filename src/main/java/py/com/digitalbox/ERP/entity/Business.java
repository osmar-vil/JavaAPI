package py.com.digitalbox.ERP.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import py.com.digitalbox.ERP.dto.business.BusinessRequest;

@Table(name = "business")
@Entity(name = "Business")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Business {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String address;
    private String work_hours;
    private String phone;
    private String whatsapp;
    private String email;

    public Business (BusinessRequest request) {
        name = request.name();
        description = request.description();
        address = request.address();
        work_hours = request.work_hours();
        phone = request.phone();
        whatsapp = request.whatsapp();
        email = request.email();
    }
}
