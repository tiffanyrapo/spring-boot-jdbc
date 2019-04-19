package com.tist.dao.impl;

import com.tist.dao.DeptDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.tist.domain.Dept;
import com.tist.mapper.DeptMapper;

import javax.annotation.Resource;
import java.util.List;


@Repository("com.tist.DeptDao")
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
        insert = (Dept) jdbcTemplate.queryForObject("INSERT INTO MOCK_DATA_DEPT (ID_, DEPT_NAME_) VALUES (?, ?)", new DeptMapper());

//        jdbcTemplate.update("INSERT INTO MOCK_DATA_DEPT (ID_, DEPT_NAME_) VALUES (?, ?)",new Object[]{dept.getId(),dept.getName()});
        return insert;
    }

    @Override
    public Dept update(Dept dept) {
        Dept update = (Dept) jdbcTemplate.queryForObject("UPDATE MOCK_DATA_DEPT SET ID_="+dept.getId()+",DEPT_NAME_=?",new DeptMapper());
        return update;
    }

    @Override
    public void delete(Dept dept) {
        jdbcTemplate.update("DELETE DROM MOCK_DATA_DEPT WHERE (?)", new Object[]{dept.getId()});
    }

/*
@Override
public List<Dept> findAll() {
return null;
}

@Override
public Dept findById(int id) {
return null;
}
*/
}


