package ru.gb.marketplace.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.marketplace.core.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    Role findByName(String name);

}