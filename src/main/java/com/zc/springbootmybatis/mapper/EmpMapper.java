package com.zc.springbootmybatis.mapper;

import com.zc.springbootmybatis.entity.Emp;

import java.util.List;
import java.util.Map;

/**
 * @Author Kent Lee
 * 2018/8/12
 */

public interface EmpMapper {
    public Emp findById(Integer empno);

    // mybatis使用map对象包含多个参数
    public List<Map> findDepts(Map param);

    // insert
    public void create(Emp emp);

    // update
    public void update(Emp emp);

    // delete
    public void delete(Integer empno);

}
