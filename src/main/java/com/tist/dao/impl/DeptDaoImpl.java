package com.tist.dao.impl;

import com.tist.dao.DaoInterface;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.tist.domain.Dept;
import com.tist.mapper.DeptMapper;

import javax.annotation.Resource;
import java.util.List;

@Repository
//public class DeptDao implements DeptDaoInterface {
    public class DeptDaoImpl implements DaoInterface<Dept> {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Dept> findAll() {
        return null;
    }

    @Override
    public Dept findById(int id) {
        return null;
    }

    @Override
    public Dept insert(Dept dept) {
        return null;
    }

    @Override
    public Dept update(Dept dept) {
        return null;
    }

    @Override
    public void delete(Dept dept) {

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


