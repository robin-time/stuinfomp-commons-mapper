package com.lxy.stuinfomp.commons.mapper;

import com.lxy.stuinfomp.commons.domain.Teachers;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.MyMapper;

/**
 * @author lxy
 */
public interface TeachersMapper extends MyMapper<Teachers> {
    @Select("select Max(id) from teachers")
    Long selectStudentMaxId();
}