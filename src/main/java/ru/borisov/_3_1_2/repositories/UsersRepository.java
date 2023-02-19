package ru.borisov._3_1_2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.borisov._3_1_2.models.User;


@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {
}
