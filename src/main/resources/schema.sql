create table USERS (
                       userid INT AUTO_INCREMENT PRIMARY KEY,
                       clientid INT,
                       status INT,
                       login VARCHAR(250)
);

CREATE TABLE USERSESSIONS (
                        sessionid INT AUTO_INCREMENT PRIMARY KEY,
                        userid INT,
                        channeltype INT,
                        opentime DATE,
                        closetime DATE,
                        lang VARCHAR(10),
                        mobosversion INT,
                        mobappversion INT,
                        FOREIGN KEY (userid) REFERENCES USERS(userid)


);
