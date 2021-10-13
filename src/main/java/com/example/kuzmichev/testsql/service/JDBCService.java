package com.example.kuzmichev.testsql.service;

import java.util.List;

public interface JDBCService {
    int getNoSessionClient();
    List<Integer> getUniqUserIdActive();
    int getMaxActiveUserIdStatusNot1();
}
