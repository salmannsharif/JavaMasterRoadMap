package com.training.postgresSQL;

public class SampleStatements {
    /*-- 1. Retrieve all columns:
    SELECT * FROM actor;

-- 2. Retrieve specific columns:
    SELECT actor_id, first_name, last_name FROM actor;

-- 3. Alias columns for readability:
    SELECT actor_id AS ID, first_name AS 'First Name', last_name AS 'Last Name' FROM actor;

-- 4. Filter by specific value:
    SELECT * FROM actor WHERE last_name = 'Smith';

-- 5. Filter with multiple conditions (AND/OR):
    SELECT * FROM actor WHERE first_name = 'John' AND last_name = 'Doe';
    SELECT * FROM actor WHERE first_name = 'John' OR last_name = 'Doe';

-- 6. Filter with ranges or comparisons:
    SELECT * FROM actor WHERE actor_id >= 10;

-- 7. Filter with patterns (LIKE):
    SELECT * FROM actor WHERE first_name LIKE 'A%'; -- Starts with A
    SELECT * FROM actor WHERE last_name LIKE '%n'; -- Ends with n
    SELECT * FROM actor WHERE last_name LIKE '_a%'; -- Second letter is 'a'

            -- 8. Filter NULL values:
    SELECT * FROM actor WHERE last_update IS NULL;
    SELECT * FROM actor WHERE last_update IS NOT NULL;

-- 9. Sort by a single column:
    SELECT * FROM actor ORDER BY last_name ASC; -- Ascending order
    SELECT * FROM actor ORDER BY last_name DESC; -- Descending order

-- 10. Sort by multiple columns:
    SELECT * FROM actor ORDER BY last_name ASC, first_name DESC;

-- 11. Count rows:
    SELECT COUNT(*) AS TotalActors FROM actor;

-- 12. Group by and count unique last names:
    SELECT last_name, COUNT(*) AS ActorCount FROM actor GROUP BY last_name;

-- 13. Filter grouped results (HAVING):
    SELECT last_name, COUNT(*) AS ActorCount
    FROM actor
    GROUP BY last_name
    HAVING COUNT(*) > 1;

-- 14. Inner Join example:
    SELECT a.actor_id, a.first_name, b.film_id
    FROM actor a
    INNER JOIN film_actor b ON a.actor_id = b.actor_id;

-- 15. Left Join example:
    SELECT a.actor_id, a.first_name, b.film_id
    FROM actor a
    LEFT JOIN film_actor b ON a.actor_id = b.actor_id;

-- 16. Limit results:
    SELECT * FROM actor LIMIT 10; -- First 10 rows

-- 17. Paginate results:
    SELECT * FROM actor LIMIT 10 OFFSET 20; -- Next 10 rows starting from 21st row

-- 18. Simple subquery:
    SELECT * FROM actor WHERE actor_id IN (SELECT actor_id FROM film_actor);

-- 19. Correlated subquery:
    SELECT first_name, last_name
    FROM actor a
    WHERE EXISTS (
            SELECT 1
            FROM film_actor b
            WHERE a.actor_id = b.actor_id
    );

-- 20. Concatenate first and last name:
    SELECT actor_id, CONCAT(first_name, ' ', last_name) AS FullName FROM actor;

-- 21. Calculate something dynamically:
    SELECT actor_id, LENGTH(first_name) AS NameLength FROM actor;

-- 22. Find distinct last names:
    SELECT DISTINCT last_name FROM actor;

-- 23. Count distinct last names:
    SELECT COUNT(DISTINCT last_name) AS UniqueLastNames FROM actor;

-- 24. Date and time functions:
    SELECT actor_id, last_update, DATE(last_update) AS LastUpdateDate FROM actor;

-- 25. Case-when statement:
    SELECT actor_id,
            CASE
    WHEN LENGTH(first_name) > 5 THEN 'Long Name'
    ELSE 'Short Name'
    END AS NameType
    FROM actor;

-- 26. Filter by ranges with BETWEEN:
    SELECT * FROM actor WHERE actor_id BETWEEN 10 AND 50;

-- 27. Filter by a list of values:
    SELECT * FROM actor WHERE last_name IN ('Smith', 'Johnson', 'Williams'); */


}
