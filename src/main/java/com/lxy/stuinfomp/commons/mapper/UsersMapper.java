package com.lxy.stuinfomp.commons.mapper;

import com.lxy.stuinfomp.commons.domain.Users;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.MyMapper;

public interface UsersMapper extends MyMapper<Users> {
    @Select("select * from users where user_name = #{name} and is_delete = 0")
    Users selectByUserName(String name);
}