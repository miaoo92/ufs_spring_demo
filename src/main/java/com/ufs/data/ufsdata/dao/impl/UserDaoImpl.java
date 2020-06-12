package com.ufs.data.ufsdata.dao.impl;

import com.ufs.data.ufsdata.dao.UserDao;
import com.ufs.data.ufsdata.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Winston.xu
 * @date 2020/6/12
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int insert(User user) {
        return jdbcTemplate.update("insert into tb_users(nickname, openid) values(?, ?)", user.getNickname(), user.getOpenid());
    }
}
