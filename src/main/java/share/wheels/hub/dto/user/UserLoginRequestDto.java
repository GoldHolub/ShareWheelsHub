package share.wheels.hub.dto.user;

import lombok.Data;

@Data
public class UserLoginRequestDto {
    private String email;
    private String password;
}
