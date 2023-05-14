CREATE DATABASE Job;
USE Job;
-- 테이블명: UpperCamelCase
-- 컬럼명 : lowerCamelCase

CREATE TABLE Job (
	id INT PRIMARY KEY AUTO_INCREMENT,
	title VARCHAR(200) NOT NULL,
    body VARCHAR(4000) NOT NULL,
	writer VARCHAR(100),
    inserted DATETIME DEFAULT NOW()

);

DESC Job;

INSERT INTO Job (title, body, writer)
VALUES('제목샘플','본문샘플','작성자');

SELECT * FROM Job ORDER BY id DESC;




