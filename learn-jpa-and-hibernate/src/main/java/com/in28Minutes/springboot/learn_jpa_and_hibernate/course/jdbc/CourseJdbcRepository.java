package com.in28Minutes.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository // when a class talk to a database
public class CourseJdbcRepository {
    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY =
            """
                insert into course (id, name, author)
                values(1, 'Spring Boot', 'in28Minutes');
            """; // text block

    public void insert() {
        springJdbcTemplate.update(INSERT_QUERY);
    }
}
