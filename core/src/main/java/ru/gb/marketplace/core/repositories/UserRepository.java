package ru.gb.marketplace.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.marketplace.core.model.User;


public interface UserRepository extends JpaRepository<User, Integer> {

    User findByLogin(String login);

}