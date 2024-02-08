package py.com.digitalbox.ERP.dto.user;

import py.com.digitalbox.ERP.entity.User;

public record UserResponse(
        String name,
        String last_name,
        String email
) {
    public UserResponse(User user) {
        this(user.getName(), user.getLast_name(), user.getEmail());
    }
}
