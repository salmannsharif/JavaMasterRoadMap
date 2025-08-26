package com.training.write_queries_approach.repository;

/*
import com.example.demo.entity.User;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.Collections;

@Repository
public class UserNamedParamRepository {

    private final NamedParameterJdbcTemplate namedJdbc;

    public UserNamedParamRepository(NamedParameterJdbcTemplate namedJdbc) {
        this.namedJdbc = namedJdbc;
    }

    public User findByUsername(String username) {
        String sql = "SELECT * FROM users WHERE username = :username";
        return namedJdbc.queryForObject(sql, Collections.singletonMap("username", username),
                (rs, rowNum) -> new User(rs.getLong("id"), rs.getString("username"), rs.getString("email")));
    }
}

 */