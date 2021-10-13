package com.example.kuzmichev.testsql.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;

@Repository
public class DaoJDBCImpl implements DaoJDBC {

    private JdbcTemplate jdbcTemplate;

    private final String GET_COUNT_CLIENTS_NO_SESSION = "SELECT COUNT (clientid ) FROM users WHERE userid NOT IN (SELECT DISTINCT userid FROM usersessions)";
    private final String GET_LIST_UNIQ_USERS_ACTIVE_NO_CHANNEL_1 = "SELECT DISTINCT userid FROM usersessions WHERE channeltype NOT IN (1)";
    private final String GET_MAX_USERID_ACTIVE_STATUS_NO_1 = "SELECT MAX(t.userid) FROM usersessions t JOIN users c ON t.userid=c.userid WHERE c.status NOT IN (1)";

    @Autowired
    public DaoJDBCImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int getNoSessionClient() {
        return jdbcTemplate.queryForObject(GET_COUNT_CLIENTS_NO_SESSION, Integer.class);
    }

    @Override
    public List<Integer> getUniqUserIdActive() {
        return jdbcTemplate.queryForList(GET_LIST_UNIQ_USERS_ACTIVE_NO_CHANNEL_1, Integer.class);
    }

    @Override
    public int getMaxActiveUserIdStatusNot1() {
        return jdbcTemplate.queryForObject(GET_MAX_USERID_ACTIVE_STATUS_NO_1, Integer.class);
    }
}
