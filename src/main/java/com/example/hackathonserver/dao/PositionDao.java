package com.example.hackathonserver.dao;

import java.sql.Array;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class PositionDao {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    private List<Integer> users;

    @Autowired
    public void PositionDao(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }


    @PostConstruct
    private void postConstruct() throws SQLException {
        String SQL = "SELECT DISTINCT(user_id)FROM mayank.positions";
        users = jdbcTemplateObject.queryForList(SQL, Integer.class);
//        users = Arrays.asList((Integer[]) l.getArray());
    }

    public List<Position> listStudents(int limit) {
        String SQL = "select * from mayank.positions where user_id=24362 limit " + limit;
        List<Position> students = jdbcTemplateObject.query(SQL, new PositionMapper());
        return students;
    }

    public List<Position> listPointsForUsers(int limit, int usersCount) {
        List<Integer> usersList = users.subList(0, usersCount);
        String inSql = String.join(",", Collections.nCopies(usersList.size(), "?"));

        String SQL = String.format("select * from mayank.positions where user_id IN(%s) limit %s",
            inSql, limit);
        List<Position> students = jdbcTemplateObject.query(SQL, usersList.toArray(), new PositionMapper());
        return students;
    }
}
