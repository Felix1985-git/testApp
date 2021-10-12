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
//      SELECT COUNT (clientid ) FROM users
//      WHERE userid NOT IN (SELECT DISTINCT userid FROM usersessions)

//      Вариант 2
//      SELECT COUNT (clientid)
//      FROM usersessions t
//      RIGHT JOIN users c on t.userid=c.userid
//      WHERE t.userid IS NULL

//      - Получить список уникальных UserId активных пользователей, которые не пользовались каналом 1.
//      SELECT DISTINCT userid
//      FROM usersessions WHERE channeltype NOT IN (1)
