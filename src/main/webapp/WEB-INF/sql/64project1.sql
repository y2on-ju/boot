USE Board;
SELECT * FROM Board;
SELECT * FROM Member;

UPDATE Board
SET writer = '111';

ALTER TABLE Board
ADD FOREIGN KEY (writer) REFERENCES Member(id);


SELECT * FROM Board ORDER BY 1 DESC;
SELECT * FROM FileName ORDER BY 1 DESC;

SELECT * FROM Member;




-- 권한 테이블
CREATE TABLE MemberAuthority (
	memberId VARCHAR(20) NOT NULL,
    authority VARCHAR(30) NOT NULL,
    FOREIGN KEY (memberId) REFERENCES Member(id),
    PRIMARY KEY (memberId, authority)
);
SELECT * FROM MemberAuthority;

INSERT INTO MemberAuthority 
VALUES ('admin0', 'admin');

DESC Member;

SELECT *
FROM Member m LEFT JOIN MemberAuthority ma ON m.id = ma.memberId
WHERE m.id = 'user5';

