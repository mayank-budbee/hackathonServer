package com.example.hackathonserver.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class PositionMapper implements RowMapper<Position> {
    public Position mapRow(ResultSet rs, int rowNum) throws SQLException {
        Position position = new Position(rs.getInt("user_id"),rs.getString("date"),
            Double.valueOf(rs.getString("lat")), Double.valueOf(rs.getString("lon")));
        return position;
    }
}
