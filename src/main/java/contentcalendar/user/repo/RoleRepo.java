package contentcalendar.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import contentcalendar.user.domain.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}