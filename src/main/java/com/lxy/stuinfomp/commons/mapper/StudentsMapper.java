package com.lxy.stuinfomp.commons.mapper;

import com.lxy.stuinfomp.commons.domain.Students;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.MyMapper;

/**
 * @author lxy
 */
public interface StudentsMapper extends MyMapper<Students> {

    @Select("select Max(id) from students")
    Long selectStudentMaxId();
}