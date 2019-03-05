package com.tist.service.impl;

import com.tist.dao.impl.DeptDaoImpl;
import com.tist.domain.Dept;
import com.tist.service.ServiceInterface;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeptServiceImpl implements ServiceInterface<Dept> {
    @Resource
    private DeptDaoImpl deptDao;

    public List<Dept> findAll(){
        List<Dept> dept=deptDao.findAll();
        System.out.println(dept.size());
        return dept;
    }

    public Dept findById(int id){
        return deptDao.findById(id);}
}
