package share.wheels.hub.model;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "roles")
public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false, columnDefinition = "varchar")
    @Enumerated(EnumType.STRING)
    private RoleName role;

    public Role() {
    }

    public Role(RoleName role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return role.name();
    }

    public enum RoleName {
        CUSTOMER,
        MANAGER
    }
}
