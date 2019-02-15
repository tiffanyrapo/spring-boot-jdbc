package com.tist.dao;

import com.tist.domain.City;
import com.tist.mapper.CityMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class CityDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public List<City> findAll() {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT * FROM MOCK_DATA_CITY ");
        List<City> cityList = new ArrayList<>();
        list.forEach(map -> {
            City city = new City();
            city.setId((Integer) map.get("ID_"));
            city.setName((String) map.get("NAME_"));
            cityList.add(city);
        });
//        List<City> cityList = jdbcTemplate.query("SELECT * FROM MOCK_DATA_CITY ", new CityMapper());
        return cityList;
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
}
