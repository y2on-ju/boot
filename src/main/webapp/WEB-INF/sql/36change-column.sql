-- CHANGE COLUMN 컬럼 변경

DESC MyTable13;
ALTER TABLE MyTable13
CHANGE COLUMN col3 col13 VARCHAR(20); -- 위험!!

INSERT INTO MyTable13 (col13) 
VALUES ('가나다라마바사');
SELECT * FROM MyTable13;

ALTER TABLE MyTable13
CHANGE COLUMN col13 col3 VARCHAR(3); -- fail

-- 연습) col10 을 col20 VARCHAR(20)으로 변경
ALTER TABLE MyTable13
CHANGE COLUMN col10 col20 VARCHAR(20);
DESC MyTable13;



