package com.tist.service;

import com.tist.dao.CityDao;
import com.tist.domain.City;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CityService {
    @Resource
    private CityDao dao;

    public List<City> findAll() {
        return dao.findAll();
    }

    public City findById(int id) {
        return dao.findById(id);
    }
}
