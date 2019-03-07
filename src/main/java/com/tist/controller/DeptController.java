package com.tist.controller;

import com.tist.service.impl.DeptServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class DeptController {
    @Resource
    private DeptServiceImpl deptService;

}
