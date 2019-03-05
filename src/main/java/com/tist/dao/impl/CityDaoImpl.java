package com.tist.dao.impl;

import com.tist.dao.DaoInterface;
import com.tist.domain.City;
import com.tist.mapper.CityMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
//public class CityDao implements CityDao{
public class CityDaoImpl implements DaoInterface<City> {

    @Resource
    private JdbcTemplate jdbcTemplate;


    public List<City> findAll() {
//        List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT * FROM MOCK_DATA_CITY ");
//        List<City> cityList = new ArrayList<>();
//        list.forEach(map -> {
//            City city = new City();
//            city.setId((Integer) map.get("ID_"));
//            city.setName((String) map.get("NAME_"));
//            cityList.add(city);
//        });
        return jdbcTemplate.query("SELECT * FROM MOCK_DATA_CITY ", new CityMapper());
    }

    public City findById(int id) {
        City city = null;
        try {
            city = (City) jdbcTemplate.queryForObject("SELECT * FROM MOCK_DATA_CITY WHERE ID_=?",
                    new Object[]{id}, new CityMapper());
        } catch (Exception e) {
            System.err.println("Id not found");
        }
        return city;
    }

    @Override
    public City insert(City city) {
        return null;
    }

    @Override
    public City update(City city) {
        return null;
    }

    @Override
    public void delete(City city) {

    }

//    @Override
//    public City insert(City city) {
//        jdbcTemplate.execute("INSERT INTO MOCK_DATA_CITY (ID_, NAME_) VALUES (1, 'Sandefjord');");
//
//        return null;
//    }
//
//    @Override
//    public City update(City city) {
//        jdbcTemplate.update("UPDATE MOCK_DATA_CITY SET ID_ = '9', Name_= 'Frankfurt'");
//        return null;
//    }
//
//    @Override
//    public void delete(City city) {
//        jdbcTemplate.update("DELETE FROM MOCK_DATA_CITY WHERE ID_='277'");
//    }
}
