package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.entity.Emp;

@Mapper
public interface EmpMapper extends BaseMapper<Emp> {
}
