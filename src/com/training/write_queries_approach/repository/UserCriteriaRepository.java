package com.training.write_queries_approach.repository;

/*
import com.example.demo.entity.User;
import jakarta.persistence.*;
import jakarta.persistence.criteria.*;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class UserCriteriaRepository {

    @PersistenceContext
    private EntityManager em;

    public List<User> findByEmailDomain(String domain) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<User> query = cb.createQuery(User.class);
        Root<User> root = query.from(User.class);

        Predicate condition = cb.like(root.get("email"), "%" + domain);
        query.select(root).where(condition);

        return em.createQuery(query).getResultList();
    }
}

 */