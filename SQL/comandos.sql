-- Criar um banco
CREATE DATABASE nomedobanco;

-- Excluir um banco
DROP DATABASE nomedobanco;

-- SELECT
SELECT coluna1, coluna2 FROM tabela; -- ou *
SELECT DISTINCT coluna1, coluna2 FROM tabela;

-- WHERE
SELECT coluna1, coluna2
FROM tabela
WHERE condição; -- exemplo de condição
-- OPERADOR    DESCRIÇÃO
-- =           IGUAL
-- >           MAIOR QUE
-- <           MENOR QUE
-- >=          MAIOR OU IGUAL
-- <=          MENOR OU IGUAL
-- <>          DIFERENTE DE
-- AND         OPERADOR LÓGICO E 
-- OR          OPERADOR LÓGICO OU

-- EXEMPLO DO USO DE WHERE
SELECT *
FROM Person.Person
WHERE Firstname = 'peter' AND Lastname = 'krebs';

SELECT *
FROM Person.EmailAddress
WHERE BussinessEntityID = 26;

-- COUNT - mostra o número de linhas que batem com a condição
SELECT COUNT(DISTINCT COLUNA1) FROM TABELA; -- exemplo
SELECT COUNT(SIZE) FROM Production.Product;

-- TOP - seleciona os 10 primeiros registros
SELECT TOP 10 * FROM TABELA;

-- ORDER BY
SELECT COLUNA1, COLUNA2
FROM TABELA
ORDER BY COLUNA1 ASC; -- ou DESC

-- EXEMPLO
SELECT TOP 4 Name, ProductNumber
FROM Production.Product
ORDER BY ProductID ASC;

-- BETWEEN
SELECT * 
FROM Production.Product
WHERE ListPrice BETWEEN 1000 AND 1500;

SELECT * 
FROM Production.Product
WHERE ListPrice NOT BETWEEN 1000 AND 1500;

SELECT HireDate
FROM HumanResources.Employee
WHERE HireDate BETWEEN '2009-01-01' AND '2010-01-01'
ORDER BY HireDate;

-- IN
SELECT *
FROM Person.Person
WHERE BusinessEntityID IN (2, 7, 13);

SELECT *
FROM Person.Person
WHERE BusinessEntityID NOT IN (2, 7, 13);

-- LIKE
SELECT *
FROM Person.Person
WHERE Firstname LIKE 'lembrodocomeco%'; -- o que tem depois do % não lembro

SELECT *
FROM Person.Person
WHERE Firstname LIKE '%lembrodofinal'; -- o que tem antes do % não lembro

SELECT *
FROM Person.Person
WHERE Firstname LIKE '%lembrodomeio%'; -- o que tem antes e depois das % não lembro

SELECT *
FROM Person.Person
WHERE Firstname LIKE '%lembrodotamanho__'; -- o que tem depois da % lembro só de uma parte, mas sei que são 2 letras

-- FUNÇÕES DE AGREGAÇÃO
SELECT TOP 10 SUM(LineTotal) AS 'Soma' FROM Sales.SalesOrderDetail;
SELECT TOP 10 MIN(LineTotal) AS 'MÍNIMO' FROM Sales.SalesOrderDetail;
SELECT TOP 10 MAX(LineTotal) AS 'MÁXIMO' FROM Sales.SalesOrderDetail;
SELECT TOP 10 AVG(LineTotal) AS 'MÉDIA' FROM Sales.SalesOrderDetail;
SELECT TOP 10 COUNT(LineTotal) AS 'QUANTAS VEZES' FROM Sales.SalesOrderDetail;

-- FIM DOS FUNDAMENTOS, COMEÇO DO INTERMEDIÁRIO

-- GROUP BY
SELECT AVG(ListPrice) AS MÉDIA
FROM Production.Product;

SELECT Color, AVG(ListPrice) AS MÉDIA
FROM Production.Product
GROUP BY Color;

-- SINTAXE
SELECT COLUNA1, FuncaoAgregacao(COLUNA2)
FROM nomeTabela
GROUP BY coluna1;

-- EXEMPLOS
SELECT ProductID, COUNT(ProductID) AS "Contagem"
FROM Sales.SalesOrderDetail
GROUP BY ProductID;

SELECT FirstName, COUNT(FirstName) AS "Vezes"
FROM Person.Person
GROUP BY FirstName
ORDER BY FirstName ASC;

SELECT Color, AVG(ListPrice) AS preço
FROM Production.Product
GROUP BY Color;

-- HAVING
SELECT COLUNA1, FUNCAODEAGREGACAO(COLUNA2)
FROM TABELA
GROUP BY COLUNA1
HAVING CONDIÇÃO;

-- EXEMPLOS
SELECT ProductID, SUM(LineTotal) AS 'total'
FROM Sales.SalesOrderDetail
GROUP BY ProductID
HAVING SUM(LineTotal) BETWEEN 162000 AND 500000;

SELECT FirstName, COUNT(FirstName) AS 'QUANTIDADE'
FROM Person.Person
WHERE Title = 'Mr.'
GROUP BY FirstName
HAVING COUNT(FirstName) > 10
ORDER BY QUANTIDADE DESC;

-- INNER JOIN
SELECT AB.COLUNA1, AB.COLUNA2, AB.COLUNA3, AB2.COLUNA1
FROM PRIMEIRATABELA AS AB 
INNER JOIN SEGUNDATABELA AS AB2 
ON AB.CoisaEmComum = AB2.CoisaEmComum;

-- EXEMPLOS
SELECT PH.BusinessEntityID, PH.PhoneNumber, PH.PhoneNumberTypeID, PT.Name
FROM Person.PersonPhone AS PH
INNER JOIN Person.PhoneNumberType AS PT ON PH.PhoneNumberTypeID = PT.PhoneNumberTypeID;

SELECT PA.AddressID, PA.City, PS.StateProvinceID, PS.Name
FROM Person.Address AS PA
INNER JOIN Person.StateProvince AS PS ON PA.StateProvinceID = PS.StateProvinceID;

-- JOINS
-- FULL OUTER JOIN
SELECT AB.COLUNA1, AB.COLUNA2, AB.COLUNA3, AB2.COLUNA1
FROM PRIMEIRATABELA AS AB 
FULL OUTER JOIN SEGUNDATABELA AS AB2 
ON AB.CoisaEmComum = AB2.CoisaEmComum;

-- LEFT OUTER JOIN
SELECT AB.COLUNA1, AB.COLUNA2, AB.COLUNA3, AB2.COLUNA1
FROM PRIMEIRATABELA AS AB 
LEFT OUTER JOIN SEGUNDATABELA AS AB2 
ON AB.CoisaEmComum = AB2.CoisaEmComum;

-- RIGHT OUTER JOIN
SELECT AB.COLUNA1, AB.COLUNA2, AB.COLUNA3, AB2.COLUNA1
FROM PRIMEIRATABELA AS AB 
RIGHT OUTER JOIN SEGUNDATABELA AS AB2 
ON AB.CoisaEmComum = AB2.CoisaEmComum;

-- UNION
SELECT COLUNA1, COLUNA2
FROM TABELA1
UNION 
SELECT COLUNA1, COLUNA2
FROM TABELA2;

-- EXEMPLOS
SELECT [ProductID], [NAME], [ProductNumber]
FROM Production.Product 
WHERE NAME LIKE '%Chain%'
UNION
SELECT [ProductID], [NAME], [ProductNumber]
FROM Production.Product 
WHERE NAME LIKE '%Decal%'
ORDER BY Name;

SELECT FirstName, Title, MiddleName
FROM Person.Person 
WHERE Title LIKE 'Mr.'
UNION
SELECT FirstName, Title, MiddleName
FROM Person.Person 
WHERE MiddleName LIKE 'A';

SELECT Title, FirstName
FROM Person.Person
WHERE Title = 'MR.'
UNION
SELECT Title, FirstName
FROM Person.Person
WHERE Title = 'MS.';

-- DATEPART
SELECT COLUNA1, DATEPART(MONTH, ColunaComFormatoEmTimestamp) 
FROM Tabela1;

-- EXEMPLOS
SELECT SalesOrderID AS ID, DATEPART(MONTH, OrderDate) AS MES
FROM Sales.SalesOrderHeader;

SELECT AVG(TotalDue) AS Media, DATEPART(YEAR, OrderDate) AS ANO
FROM Sales.SalesOrderHeader
GROUP BY DATEPART(YEAR, OrderDate)
ORDER BY ANO;

-- OPERAÇÕES EM STRING
SELECT CONCAT(FirstName, ' ', LastName) FROM Person.Person;
SELECT UPPER(FirstName), LOWER(LastName) FROM Person.Person;
SELECT FirstName, LEN(FirstName) FROM Person.Person;
SELECT FirstName, SUBSTRING(FirstName, 1, 3) FROM Person.Person;
SELECT REPLACE(ProductNumber, '-', '#') FROM Production.Product;

-- FUNÇÕES MATEMÁTICAS
SELECT UnitPrice + LineTotal FROM Sales.SalesOrderDetail;
SELECT UnitPrice - LineTotal FROM Sales.SalesOrderDetail;
SELECT UnitPrice * LineTotal FROM Sales.SalesOrderDetail;
SELECT UnitPrice / LineTotal FROM Sales.SalesOrderDetail;

-- ARREDONDAMENTO
SELECT ROUND(LINETOTAL, 0), LineTotal FROM Sales.SalesOrderDetail;
SELECT ROUND(LINETOTAL, -1), LineTotal FROM Sales.SalesOrderDetail;

-- RAIZ QUADRADA
SELECT SQRT(LINETOTAL), LineTotal FROM Sales.SalesOrderDetail;
SELECT ROUND(SQRT(LINETOTAL), 0), LineTotal FROM Sales.SalesOrderDetail;

-- SUBQUERIES OU SUBSELECTS
SELECT COLUNA1, ...
FROM TABELA
WHERE DADO IN (
    SELECT COLUNA
    FROM TABELA
    WHERE DADO = ALGO);

-- EXEMPLOS
SELECT FirstName
FROM Person.Person
WHERE BusinessEntityID IN (
    SELECT BusinessEntityID
    FROM HumanResources.Employee
    WHERE JobTitle = 'Design Engineer');

SELECT *
FROM Production.Product
WHERE ListPrice > (
    SELECT AVG(ListPrice) FROM Production.Product);
