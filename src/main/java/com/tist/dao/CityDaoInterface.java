package com.tist.dao;

import com.tist.domain.City;

import java.util.List;

/**
 * city dao介面定義
 *
 * @author sungyeh
 */
public interface CityDaoInterface {
    List<City> findAll();

    List<City> findById(int id);

    City insert(City city);

    City update(City city);

    void delete(City city);


}