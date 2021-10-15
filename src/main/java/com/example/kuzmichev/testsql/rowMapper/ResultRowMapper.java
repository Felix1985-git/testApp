package com.example.kuzmichev.testsql.rowMapper;

import com.example.kuzmichev.testsql.dto.ResultSetDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultRowMapper implements RowMapper<ResultSetDto> {
    @Override
    public ResultSetDto mapRow(ResultSet rs, int rowNum) throws SQLException {
        ResultSetDto resultSetDto = new ResultSetDto();
        resultSetDto.setMobAppVersion(rs.getInt(1));
        resultSetDto.setCount(rs.getInt(2));
        return resultSetDto;
    }
}