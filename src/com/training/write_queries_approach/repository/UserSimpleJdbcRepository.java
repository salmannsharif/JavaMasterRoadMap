package com.training.write_queries_approach.repository;

/*
import com.example.demo.entity.User;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UserSimpleJdbcRepository {

    private final SimpleJdbcInsert simpleInsert;

    public UserSimpleJdbcRepository(DataSource dataSource) {
        this.simpleInsert = new SimpleJdbcInsert(dataSource).withTableName("users").usingGeneratedKeyColumns("id");
    }

    public Long insertUser(User user) {
        Map<String, Object> params = new HashMap<>();
        params.put("username", user.getUsername());
        params.put("email", user.getEmail());
        return simpleInsert.executeAndReturnKey(params).longValue();
    }
}

 */