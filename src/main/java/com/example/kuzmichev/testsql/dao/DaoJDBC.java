package com.example.kuzmichev.testsql.dao;

import com.example.kuzmichev.testsql.dto.ResultSetDto;

import java.util.List;

public interface DaoJDBC {
    int getNoSessionClient();
    List<Integer> getUniqUserIdActive();
    int getMaxActiveUserIdStatusNot1();
    List<ResultSetDto> getCountSessionByOldMobosversionGroupByMobappversion();
}
