-- 기본구조
SELECT
FROM
WHERE
GROUP BY
ORDER BY


-- 문제 설명
-- ANIMAL_INS 테이블은 동물 보호소에 들어온 동물의 정보를 담은 테이블입니다.
-- ANIMAL_INS 테이블 구조는 다음과 같으며, ANIMAL_ID, ANIMAL_TYPE, DATETIME, INTAKE_CONDITION, NAME, SEX_UPON_INTAKE는
-- 각각 동물의 아이디, 생물 종, 보호 시작일, 보호 시작 시 상태, 이름, 성별 및 중성화 여부를 나타냅니다.

-- 동물 수 구하기
-- 동물 보호소에 동물이 몇 마리 들어왔는지 조회하는 SQL 문을 작성해주세요.
SELECT count(ANIMAL_ID)
FROM ANIMAL_INS

-- 7번 문제
-- 동물 보호소에 들어온 동물 중 아픈 동물1의 아이디와 이름을 조회하는 SQL 문을 작성해주세요. 이때 결과는 아이디 순으로 조회해주세요.
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE INTAKE_CONDITION = 'SICK'
GROUP BY ANIMAL_ID


--     상위 n개 레코드
-- SELECT NAME
-- FROM ANIMAL_INS
-- WHERE DATETIME = (SELECT MAX(DATETIME) FROM ANIMAL_INS)

SELECT NAME
FROM ANIMAL_INS
ORDER BY DATETIME
LIMIT 1

-- 최솟값구하기
SELECT DATETIME as "시간"
FROM ANIMAL_INS
ORDER BY DATETIME
    LIMIT 1

-- 어린 동물 찾기 (condition이 aged가 아닌 동물)
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE NOT INTAKE_CONDITION = 'Aged'
ORDER BY ANIMAL_ID

--     여러 기준으로 정렬하기
SELECT ANIMAL_ID, NAME, DATETIME
FROM ANIMAL_INS
ORDER BY NAME, DATETIME desc

--     이름에 el이 들어가는 동물 찾기
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE ANIMAL_TYPE = 'Dog'
  and Name LIKE '%EL%'
ORDER BY NAME


-- 나이 정보가 없는 회원수 구하기
SELECT count(USER_ID) as USERS
FROM USER_INFO
WHERE AGE is NULL

-- 가장 비싼 상품 구하기
SELECT PRICE as MAX_PRICE
FROM PRODUCT
ORDER BY PRICE DESC
    LIMIT 1