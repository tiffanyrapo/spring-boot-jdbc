package com.tist.service.impl;

import com.tist.dao.CityDao;
import com.tist.domain.City;
import com.tist.service.CityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    @Resource
    private CityDao dao;

    @Override
    public List<City> findAll() {
        List<City> cities = dao.findAll();
        return cities;
    }

    @Override
    public City findById(int id) {
        return dao.findById(id);
    }

    @Override
    public City findIdByName() {
        return null;
    }

}
