package com.zc.springbootmybatis.service;

import com.zc.springbootmybatis.entity.Emp;
import com.zc.springbootmybatis.mapper.EmpMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author Kent Lee
 * 2018/8/12
 */
@Service
public class EmpService {
    @Resource
    private EmpMapper empMapper = null;

    public Emp findById(Integer empno){
        Emp emp = empMapper.findById(empno);
        return emp;
    }

    public List<Map> findDepts(String dname, Float sal){
        Map param = new HashMap();
        param.put("pdname",dname);
        param.put("psal",sal);
        return empMapper.findDepts(param);

    }

    public void insert(Emp emp){
        empMapper.create(emp);
    }


}
