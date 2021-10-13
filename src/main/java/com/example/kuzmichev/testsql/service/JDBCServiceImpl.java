package com.example.kuzmichev.testsql.service;

import com.example.kuzmichev.testsql.dao.DaoJDBC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JDBCServiceImpl implements JDBCService {

    DaoJDBC daoJDBC;

    @Autowired
    public JDBCServiceImpl(DaoJDBC daoJDBC) {
        this.daoJDBC = daoJDBC;
    }

    @Override
    public int getNoSessionClient() {
        return daoJDBC.getNoSessionClient();
    }

    @Override
    public List<Integer> getUniqUserIdActive() {
        return daoJDBC.getUniqUserIdActive();
    }

    @Override
    public int getMaxActiveUserIdStatusNot1() {
        return daoJDBC.getMaxActiveUserIdStatusNot1();
    }
}
