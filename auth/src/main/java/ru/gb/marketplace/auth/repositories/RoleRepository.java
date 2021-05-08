package ru.gb.marketplace.auth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.marketplace.auth.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    Role findByName(String name);
}
