package com.training.write_queries_approach;

public class QueryApproachClass {

    /**
     *
     * Main Approaches to Write Queries in Spring
     *
     * 1. Spring Data JPA – Derived Query Methods
     *  Methods like findById, findByUsername → auto-generated SQL.
     *
     * 2. Spring Data JPA – JPQL (@Query)
     *  Object-oriented query language (SELECT u FROM User u WHERE u.username = ?1).
     *
     * 3. Spring Data JPA – Native SQL (@Query(nativeQuery=true))
     *  Direct SQL queries written manually.
     *
     * 4. Spring Data JPA – Criteria API
     *  Programmatic query building (CriteriaBuilder, Predicate).
     *
     * 5. Spring Data JPA – Specification API
     *  A wrapper around Criteria API, reusable and composable.
     *
     * 6. JdbcTemplate
     *  Write raw SQL but with Spring managing boilerplate (connections, statements).
     *
     * 7. NamedParameterJdbcTemplate
     *  Same as JdbcTemplate, but supports named parameters instead of ?.
     *
     * 8. SimpleJdbcInsert / SimpleJdbcCall
     *  Specialized JdbcTemplate helpers for inserts and stored procedures.
     *
     * 9. Spring Data JDBC
     *  Like JPA but without ORM (no entity manager). Simple, direct mapping.
     *
     * 10. QueryDSL (Optional)
     *  A third-party library integrated with Spring for type-safe queries.
     *
     */

}
