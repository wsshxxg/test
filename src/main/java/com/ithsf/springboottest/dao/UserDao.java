package com.ithsf.springboottest.dao;

import com.ithsf.springboottest.domain.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.additional.idlist.SelectByIdListMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

@Repository
public interface UserDao extends Mapper<User>, SelectByIdListMapper<User,Integer>, MySqlMapper<User> {
}
