package com.tist.service;

import com.tist.dao.impl.CityDaoImpl;
import com.tist.domain.City;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CityService implements ServiceInterface<City> {
    @Resource
    private CityDaoImpl dao;

    @Override
    public List<City> findAll() {
        List<City> cities = dao.findAll();
        System.out.println(cities.size());
        return cities;
    }

    @Override
    public City findById(int id) {
        return dao.findById(id);
    }

}
