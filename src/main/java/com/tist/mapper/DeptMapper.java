package com.tist.mapper;

import com.tist.domain.Dept;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DeptMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Dept(resultSet.getInt("ID_"), resultSet.getString("DEPT_NAME_)"));
    }
}

