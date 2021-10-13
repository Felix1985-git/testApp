package com.example.kuzmichev.testsql.service;

import com.example.kuzmichev.testsql.dto.ResultSetDto;

import java.util.List;

public interface JDBCService {
    int getNoSessionClient();
    List<Integer> getUniqUserIdActive();
    int getMaxActiveUserIdStatusNot1();
    List<ResultSetDto> getCountSessionByOldMobosversionGroupByMobappversion();
}
