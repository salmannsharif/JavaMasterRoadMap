package com.training.write_queries_approach.service;

/*
import com.example.demo.entity.User;
import com.example.demo.repository.*;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    private final UserRepositoryJPA jpaRepo;
    private final UserCriteriaRepository criteriaRepo;
    private final UserJdbcTemplateRepository jdbcRepo;
    private final UserNamedParamRepository namedRepo;
    private final UserSimpleJdbcRepository simpleRepo;

    public UserService(UserRepositoryJPA jpaRepo,
                       UserCriteriaRepository criteriaRepo,
                       UserJdbcTemplateRepository jdbcRepo,
                       UserNamedParamRepository namedRepo,
                       UserSimpleJdbcRepository simpleRepo) {
        this.jpaRepo = jpaRepo;
        this.criteriaRepo = criteriaRepo;
        this.jdbcRepo = jdbcRepo;
        this.namedRepo = namedRepo;
        this.simpleRepo = simpleRepo;
    }

    // Expose methods for each approach
    public User getByUsernameJPA(String username) { return jpaRepo.findByUsername(username).orElse(null); }
    public User getByUsernameJPQL(String username) { return jpaRepo.findByUsernameJPQL(username).orElse(null); }
    public User getByUsernameNative(String username) { return jpaRepo.findByUsernameNative(username).orElse(null); }
    public List<User> getByCriteria(String domain) { return criteriaRepo.findByEmailDomain(domain); }
    public User getByJdbc(String username) { return jdbcRepo.findByUsername(username); }
    public User getByNamed(String username) { return namedRepo.findByUsername(username); }
    public Long insertSimple(User user) { return simpleRepo.insertUser(user); }

 */