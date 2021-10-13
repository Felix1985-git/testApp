package com.example.kuzmichev.testsql.rowMapper;

import com.example.kuzmichev.testsql.dto.ResultSetDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultRowMapper implements RowMapper<ResultSetDto> {
    @Override
    public ResultSetDto mapRow(ResultSet rs, int rowNum) throws SQLException {
        ResultSetDto resultSetDto = new ResultSetDto();
        resultSetDto.setCount(rs.getInt(1));
        resultSetDto.setMobAppVersion(rs.getInt(2));
        resultSetDto.setMobOsVersion(rs.getInt(3));
        if (resultSetDto.getMobAppVersion()==0) {
            resultSetDto.setMobAppVersion(null);
        } else resultSetDto.setMobAppVersion(resultSetDto.getMobAppVersion());
        if (resultSetDto.getMobOsVersion() == 0) {
            resultSetDto.setMobOsVersion(null);
        } else resultSetDto.setMobOsVersion(resultSetDto.getMobOsVersion());
        return resultSetDto;
    }
}
// public ResultSetDto(Integer count, Integer mobAppVersion, Integer mobOsVersion) {