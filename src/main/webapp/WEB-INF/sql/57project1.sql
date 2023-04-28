CREATE DATABASE Board;
Use Board;

-- 테이블명 : UpperCamelCase
-- 컬럼명 : lowerCamelCase

CREATE TABLE Board (
id INT PRIMARY KEY AUTO_INCREMENT,
title VARCHAR(50) NOT NULL,
body VARCHAR(10000) NOT NULL,
writer VARCHAR(20),
inserted DATETIME DEFAULT NOW()
);
DESC Board;

INSERT INTO Board (title, body, writer)
VALUES ('샘플 제목', '샘플 본문', 'user00');





SELECT *FROM Board ORDER BY id DESC;



