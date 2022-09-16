package org.example.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.entity.Emp;
import org.example.mapper.EmpMapper;
import org.example.service.EmpService;
import org.springframework.stereotype.Service;


@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements EmpService {

}
