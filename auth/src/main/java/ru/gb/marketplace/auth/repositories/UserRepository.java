package ru.gb.marketplace.auth.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.marketplace.auth.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByLogin(String login);
}
