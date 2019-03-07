package com.tist.dao.impl;

import com.tist.dao.DaoInterface;
import com.tist.dao.DeptDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.tist.domain.Dept;
import com.tist.mapper.DeptMapper;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
//public class DeptDao implements DeptDaoInterface {
public class DeptDaoImpl implements DeptDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Dept> findAll() {
//        List<Map<String,Object>> list = jdbcTemplate.queryForList("SELECT * FROM MOCK_DATA_DEPT");
//        List<Dept> deptList = new ArrayList<>();

        return jdbcTemplate.query("SELECT * FROM MOCK_DATA_DEPT", new DeptMapper());
    }

    @Override
    public Dept findById(int id) {
        Dept dept = null;
        try {
            dept = (Dept) jdbcTemplate.queryForObject("SELECT * FROM MOCK_DATA_DEPT WHERE ID_=?",
                    new Object[]{id}, new DeptMapper());
        } catch (Exception e) {
            System.err.println("Id not found");
        }
        return dept;
    }

    @Override
    public Dept insert(Dept dept) {
        Dept insert = null;
        String sql = "INSERT INTO MOCK_DATA_DEPT (ID_, DEPT_NAME_) VALUES (" + dept.getId() + ", '" + dept.getName() + "')";
        jdbcTemplate.update(sql);
//        jdbcTemplate.update("INSERT INTO MOCK_DATA_DEPT (ID_, DEPT_NAME_) VALUES (?, ?)",new Object[]{dept.getId(),dept.getName()});
        return null;
    }

    @Override
    public Dept update(Dept dept) {
//        Dept update = (Dept) jdbcTemplate.update("UPDATE MOCK_DATA_DEPT SET ID_='10', DEPT_NAME_='Product Management'");
        return null;
    }

    @Override
    public void delete(Dept dept) {
        Dept delete = null;
        jdbcTemplate.update("DELETE DROM MOCK_DATA_DEPT WHERE ID_='7'");
    }

//    @Override
//    public List<Dept> findAll() {
//        return null;
//    }
//
//    @Override
//    public Dept findById(int id) {
//        return null;
//    }
}


