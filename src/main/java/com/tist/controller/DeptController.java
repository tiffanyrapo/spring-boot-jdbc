package com.tist.controller;

import com.tist.domain.Dept;
import com.tist.service.impl.DeptServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * 設計一表單 >設計一個ftl是表單
 * submit後server印出表單內容 >submit至某一個url，controller設計一個url，印出submit參數
 * 轉導頁面 > forward redirect
 * 頁面印出submit內容 > 設計新ftl，渲染controller至頁面上
 */

@Controller
public class DeptController {
    @Resource
    private DeptServiceImpl deptService;

    @RequestMapping("/hw")
    public String hw(Model model) {
        CityController city = new CityController();
        model.addAttribute("msg", "Hello!");
        model.addAttribute("city", city);
        return "hw";
    }

    @PostMapping("hw")
    public String formInput(Dept dept, Model model) {
        System.out.println(dept);
        model.addAttribute("list", deptService.findAll());
        return "hw";
    }

    }


