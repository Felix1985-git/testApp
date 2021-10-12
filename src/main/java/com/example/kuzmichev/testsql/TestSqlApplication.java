package com.example.kuzmichev.testsql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestSqlApplication.class, args);
    }

}


//      - Получить количество неактивных (не было сессий) клиентов.
//      Вариант 1
//      SELECT count (USERID) from USERS
//      where USERID not in(SELECT distinct USERID from USERSESSIONS )

//      Вариант 2
//      SELECT COUNT (*)
//      FROM USERSESSIONS  t
//      RIGHT JOIN USERS c on t.USERID=c.USERID
//      WHERE t.USERID is NULL


