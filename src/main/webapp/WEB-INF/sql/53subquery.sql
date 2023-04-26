-- 서브쿼리 (쿼리 안의 쿼리)
-- 책 430 쪽
-- 1) SELECT 문이다.
-- 2) 괄호 안에 있다.
-- 3) 세미콜론이 없다.

-- 작성 가능 한 위치
-- WHERE, SELECT, FROM, HAVING

USE w3schools;
-- 1번 상품의 카테고리 명
SELECT categoryId FROM Products
WHERE ProductId = 1;

SELECT categoryName FROM Categories
WHERE CategoryId = 1;

SELECT categoryName FROM Categories
WHERE CategoryId = (SELECT categoryId FROM Products
					WHERE ProductId = 1);

-- 2번 공급자와 같은 나라에 사는 고객 조회
SELECT Country FROM Suppliers
WHERE SupplierId = 2; -- USA
SELECT CustomerName FROM Customers
WHERE Country = 'USA';
SELECT CustomerName FROM Customers
WHERE Country = (SELECT Country FROM Suppliers WHERE SupplierID = 2);

-- 문제 ) 평균가격보다 높은 가격의 상품들 조회
SELECT * FROM Products;
SELECT AVG(Price) FROM Products; -- 28.866364;
SELECT * FROM Products WHERE Price > 28.866364;
SELECT * FROM Products
WHERE Price > (SELECT AVG(Price) FROM Products);




