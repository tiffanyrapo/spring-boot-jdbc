package com.tist.service;

import com.tist.domain.City;

import java.util.List;

/**
 * city service 介面定義
 *
 * @author sungyeh
 */
public interface CityServiceInterface {
    List<City> findAll();

    List<City> findById(int id);

    City insert(City city);

    City update(City city);

    void delete(City city);
}
