package com.tist.service;

import com.tist.domain.City;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 簡易單元測試
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class CityServiceTest {
    @Resource
    private CityService cityService;

    @Test
    public void test() {
        System.out.println(cityService.findAll().size());
        System.out.println(cityService.findById(2));
        City city = cityService.findById(2);
        assertThat(city).isNotNull();
        System.out.println(city);
        city = cityService.findById(50);
        assertThat(city).isNull();
        System.out.println(city);
        assertThat(cityService.findAll().size()).isEqualTo(20);
        System.out.println(cityService.findAll().size());
    }
}
