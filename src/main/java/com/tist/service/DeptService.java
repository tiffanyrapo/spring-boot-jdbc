package com.tist.service;

import com.tist.dao.impl.DeptDaoImpl;
import com.tist.domain.Dept;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeptService implements ServiceInterface<Dept> {
    @Resource
    private DeptDaoImpl deptDao;

    public List<Dept> findAll(){
        List<Dept> dept=deptDao.findAll();
        System.out.println(dept.size());
        return dept;
    }

    public Dept findById(int id){return deptDao.findById(id);}
}
