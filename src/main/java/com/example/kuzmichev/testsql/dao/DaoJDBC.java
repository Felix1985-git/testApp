package com.example.kuzmichev.testsql.dao;

import java.util.List;

public interface DaoJDBC {
    int getNoSessionClient();
    List<Integer> getUniqUserIdActive();
    int getMaxActiveUserIdStatusNot1();
}
