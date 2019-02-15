package com.tist.mapper;

import com.tist.domain.City;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CityMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        return new City(resultSet.getInt("ID_"), resultSet.getString("NAME_"));
    }
}
