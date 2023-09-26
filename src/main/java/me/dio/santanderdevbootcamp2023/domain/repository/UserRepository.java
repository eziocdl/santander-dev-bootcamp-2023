package me.dio.santanderdevbootcamp2023.domain.repository;


import me.dio.santanderdevbootcamp2023.domain.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
