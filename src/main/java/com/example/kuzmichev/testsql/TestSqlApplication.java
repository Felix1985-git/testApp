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
//      RIGHT JOIN users c ON t.userid=c.userid
//      WHERE t.userid IS NULL

//      - Получить список уникальных UserId активных пользователей, которые не пользовались каналом 1.
//      SELECT DISTINCT userid
//      FROM usersessions WHERE channeltype NOT IN (1)

//      - Получить максимальное UserId активного пользователя, статус которого также не равен 1.
//      SELECT MAX(t.userid)
//      FROM usersessions t
//      JOIN users c ON t.userid=c.userid AND c.status NOT IN (1)

//      - Получить список количества сессий с разделением на MobAppVersion. То есть список, сгруппированный по MobAppVersion,
//      в котором для каждой из MobAppVersion будет подсчитано количество сессий со "старой" mobosversion,
//      "старой" версией считается версия ниже 80 или неуказанная
//       SELECT COUNT (sessionid) AS Session_count,  mobappversion, mobosversion
//       FROM usersessions t
//       WHERE t.mobosversion  IS NULL  OR t.mobosversion < 80
//       GROUP BY mobappversion