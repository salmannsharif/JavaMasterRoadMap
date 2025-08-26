package com.training.write_queries_approach.repository;

/*
import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.Optional;

public interface UserRepositoryJPA extends JpaRepository<User, Long> {

    // Derived
    Optional<User> findByUsername(String username);

    // JPQL
    @Query("SELECT u FROM User u WHERE u.username = ?1")
    Optional<User> findByUsernameJPQL(String username);

    // Native SQL
    @Query(value = "SELECT * FROM users u WHERE u.username = ?1", nativeQuery = true)
    Optional<User> findByUsernameNative(String username);
}

 */