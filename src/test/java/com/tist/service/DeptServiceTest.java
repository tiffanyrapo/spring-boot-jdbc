package com.tist.service;

import com.tist.domain.Dept;
import com.tist.service.impl.DeptServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.transaction.Transactional;


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
      //assertThat
//      System.out.println(dept);
//      dept=deptService.findById(30);
//     // assertThat
//      System.out.println(dept);
//      //assertThat
//      System.out.println(deptService.findAll().size());
       }


}

