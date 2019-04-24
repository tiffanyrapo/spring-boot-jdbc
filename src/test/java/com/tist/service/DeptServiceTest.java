package com.tist.service;

import com.tist.domain.Dept;
import com.tist.service.impl.DeptServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * 簡易單元測試練習
  */

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class DeptServiceTest {

  @Resource
  private DeptServiceImpl deptService;

  @Test
   public  void test(){
      System.out.println(deptService.findAll());
      System.out.println(deptService.findById(3));
      Dept dept=deptService.findById(3);
      assertThat(dept).isNotNull();
      System.out.println(dept);
      dept=deptService.findById(30);
      assertThat(dept).isNull();
      System.out.println(dept);
      assertThat(deptService.findAll().size()).isEqualTo(10);
      System.out.println(deptService.findAll().size());
       }


}

