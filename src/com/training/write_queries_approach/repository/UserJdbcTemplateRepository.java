package com.training.write_queries_approach.repository;

/*
import com.example.demo.entity.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class UserJdbcTemplateRepository {

    private final JdbcTemplate jdbcTemplate;

    public UserJdbcTemplateRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public User findByUsername(String username) {
        String sql = "SELECT * FROM users WHERE username = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{username}, (rs, rowNum) ->
                new User(rs.getLong("id"), rs.getString("username"), rs.getString("email"))
        );
    }

    public List<User> findAll() {
        return jdbcTemplate.query("SELECT * FROM users", (rs, rowNum) ->
                new User(rs.getLong("id"), rs.getString("username"), rs.getString("email"))
        );
    }
}

 */