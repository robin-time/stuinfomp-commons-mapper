package com.lxy.stuinfomp.commons.mapper;

import com.lxy.stuinfomp.commons.domain.Courses;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.MyMapper;

public interface CoursesMapper extends MyMapper<Courses> {
    @Select("select Max(id) from courses")
    Long selectMaxId();
}