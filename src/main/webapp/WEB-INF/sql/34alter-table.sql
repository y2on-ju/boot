USE w3schools;
-- ALTER TABLE : 테이블 변경
CREATE TABLE MyTable13 (
	col1 INT,
    col2 INT
);

-- 컬럼 추가 ADD COLUMN
ALTER TABLE MyTable13 
ADD COLUMN col3 VARCHAR(10);
DESC MyTable13;
ALTER TABLE MyTable13
ADD COLUMN col4 DEC(10, 2);
-- 연습) MyTable13에 5번째 컬럼 추가
ALTER TABLE MyTable13 ADD COLUMN col5 INT;
DESC MyTable13;

-- 첫번째 컬럼으로 추가
ALTER TABLE MyTable13 ADD COLUMN col6 INT FIRST;
ALTER TABLE MyTable13 ADD COLUMN col7 INT FIRST;
DESC MyTable13;

-- 중간에 컬럼 추가
ALTER TABLE MyTable13 
ADD COLUMN col8 VARCHAR(9) AFTER col7;
DESC MyTable13;

-- 연습) 첫번째 컬럼으로 하나 추가
ALTER TABLE MyTable13 ADD COLUMN col9 INT FIRST;
DESC MyTable13;
-- 연습) 컬럼을 중간에 추가
ALTER TABLE MyTable13 ADD COLUMN col10 INT AFTER col6;







