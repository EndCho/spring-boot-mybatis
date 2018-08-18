package com.zc.springbootmybatis.controller;

import com.zc.springbootmybatis.entity.Emp;
import com.zc.springbootmybatis.service.EmpService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author Kent Lee
 * 2018/8/12
 */
@RestController
public class EmpController {
    @Resource
    private EmpService empService = null;


    @RequestMapping("/emp/{id}")
    public Emp findById(@PathVariable("id") Integer id){
        Emp emp = empService.findById(id);
        return emp;

    }

    @RequestMapping("/emp/list")
    public List<Map> findDepts(String dname, Float sal){
        List<Map> list = empService.findDepts(dname, sal);
        return list;

    }
    @RequestMapping("/emp/create")
    public Emp create(){
        Emp emp = new Emp();
        emp.setSal(1000f);
        emp.setComm(0f);
        emp.setDeptno(30);
        emp.setEname("zc");
        emp.setJob("Student");
        emp.setHiredate(new Date());
        emp.setMgr(null);
        empService.create(emp);
        return emp;
    }
}
