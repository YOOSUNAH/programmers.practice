-- 기본구조
select
from
where
group by
having BY
order by


--
-- NULL 처리하기
select ANIMAL_TYPE,
       IF (NAME is null, 'No name', NAME) as NAME
        , SEX_UPON_INTAKE
from ANIMAL_INS

--          경기도에 위치한 식품창고 목록 출력하기
select WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS,
       If(FREEZER_YN is null, 'N', FREEZER_YN) as FREEZER_YN
from FOOD_WAREHOUSE
where ADDRESS like '경기도%'
order by WAREHOUSE_ID

--     강원도에 위치한 생산공장 목록 출력하기
select FACTORY_ID, FACTORY_NAME, ADDRESS
from FOOD_FACTORY
where ADDRESS like '강원도%'
order by FACTORY_ID

--     DATETIME에서 DATE로 형 변환
select ANIMAL_ID, NAME,
       DATE_FORMAT(DATETIME, '%Y-%m-%d') as 날짜
from ANIMAL_INS
order by ANIMAL_ID

--     흉부외과 또는 일반외과 의사 목록 출력하기
select  DR_NAME, DR_ID, MCDP_CD,
        DATE_FORMAT(HIRE_YMD, '%Y-%m-%d') as HIRE_YMD
from DOCTOR
where MCDP_CD = 'CS' or MCDP_CD	= 'GS'
order by HIRE_YMD desc, DR_NAME

--     가격이 제일 비싼 식품의 정보 출력하기
select  PRODUCT_ID, PRODUCT_NAME, PRODUCT_CD,
        CATEGORY, PRICE
from FOOD_PRODUCT
order by PRICE desc
    limit 1

-- 이름이 없는 동물의 아이디
select  ANIMAL_ID
from ANIMAL_INS
where NAME is null
order by ANIMAL_ID

--     조건에 맞는 회원수 구하기
select count(USER_ID) as USERS
from USER_INFO
where YEAR(JOINED) = '2021'
  and 20 <= AGE and AGE <= 29;

-- 중성화 여부 파악하기
select ANIMAL_ID, NAME,
       IF (SEX_UPON_INTAKE like 'Neutered%' or  SEX_UPON_INTAKE like 'Spayed%', 'O', 'X') as '중성화'
FROM ANIMAL_INS
order by ANIMAL_ID

--     카테고리 별 상품 개수 구하기
select LEFT(PRODUCT_CODE, 2) CATEGORY
        , count(PRODUCT_ID) PRODUCTS
from PRODUCT
group by CATEGORY


--     고양이와 개는 몇 마리 있을까
select ANIMAL_TYPE, count(ANIMAL_TYPE)
from ANIMAL_INS
group by ANIMAL_TYPE
order by ANIMAL_TYPE

-- 26 입양 시각 구하기
select  HOUR(DATETIME) HOUR,
       count(DATETIME) COUNT
   from ANIMAL_OUTS
   group by HOUR(DATETIME)
   having HOUR >= 9 and HOUR <= 19
   order by HOUR(DATETIME)

-- having 대신 where 이용한 풀이
select  HOUR(DATETIME) HOUR,
    count(DATETIME) COUNT
from ANIMAL_OUTS
where HOUR(DATETIME) >= 9 and HOUR(DATETIME) <= 19
group by HOUR(DATETIME)
order by HOUR(DATETIME)


-- 진료과별 총 예약 횟수 출력하기
select MCDP_CD as '진료과코드', COUNT(PT_NO) as '5월예약건수'
FROM APPOINTMENT
WHERE YEAR(APNT_YMD) = '2022' AND MONTH(APNT_YMD) = '05'
GROUP BY MCDP_CD
ORDER BY 5월예약건수,  진료과코드

-- 12세 이하인 여자 환자 목록 출력하기
select PT_NAME, PT_NO, GEND_CD, AGE, IF (TLNO is null, 'NONE', TLNO) as TLNO
from PATIENT
where (AGE <= 12) and (GEND_CD = 'W')
order by AGE desc, PT_NAME

-- 인기있는 아이스크림
select FLAVOR
from FIRST_HALF
order by TOTAL_ORDER desc, SHIPMENT_ID

-- 자동차 종류 별 특정 옵션이 포함된 자동차 수 구하기
select CAR_TYPE, count(CAR_ID) as CARS
from CAR_RENTAL_COMPANY_CAR
where OPTIONS like '%열선시트%' or OPTIONS like '%통풍시트%' or OPTIONS like '%가죽시트%'
group by CAR_TYPE
order by CAR_TYPE

-- 오랜 기간 보호한 동물(1)
select A.NAME, A.DATETIME
from ANIMAL_INS A left join ANIMAL_OUTS B on A.ANIMAL_ID = B.ANIMAL_ID
where B.ANIMAL_ID is null
order by A.DATETIME
    LIMIT 3

-- 카테고리 별 도서 판매량 집계하기
select A.CATEGORY, sum(B.SALES) TOTAL_SALES
from BOOK A join BOOK_SALES B on A.BOOK_ID = B.BOOK_ID
where B.SALES_DATE like '2022-01%'
group by A.CATEGORY
order by A.CATEGORY

-- 다른 풀이
select B.CATEGORY, sum(BS.SALES)  TOTAL_SALES
from BOOK as B, BOOK_SALES as BS
where YEAR(BS.SALES_DATE) = '2022'and MONTH(BS.SALES_DATE) = '01'
and BS.BOOK_ID = B.BOOK_ID
group by B.CATEGORY
order by B.CATEGORY

-- 다른 풀이
select A.category, sum(B.sales)
from book A join book_sales B on A.book_id = B.book_id
where DATE_FORMAT(B.sales_date, '%Y-%m') = '2022-01'
group by A.category
order by A.category

--     오랜 기간 보호한 동물(2)
select A.ANIMAL_ID, A.NAME
from ANIMAL_INS as A, ANIMAL_OUTS as B
where A.ANIMAL_ID = B.ANIMAL_ID
order by B.DATETIME - A.DATETIME
        desc LIMIT 2

--     오랜 기간 보호한 동물(2) 다른 풀이
select A.ANIMAL_ID, A.NAME
from ANIMAL_INS as A, ANIMAL_OUTS as B
where A.ANIMAL_ID = B.ANIMAL_ID
order by B.DATETIME - A.DATETIME desc
LIMIT 2

--    보호소에서 중성화한 동물
select I.ANIMAL_ID, I.ANIMAL_TYPE, I.NAME
from ANIMAL_INS as I join ANIMAL_OUTS as O
where I.ANIMAL_ID = O.ANIMAL_ID and I.SEX_UPON_INTAKE != O.SEX_UPON_OUTCOME
order by I.ANIMAL_ID

--     조건에 맞는 도서와 저자 리스트 출력하기
select B.BOOK_ID, A.AUTHOR_NAME,
       DATE_FORMAT(B.PUBLISHED_DATE, '%Y-%m-%d') as PUBLISHED_DATE
from BOOK B
         left join AUTHOR A on B.AUTHOR_ID = A.AUTHOR_ID
where B.CATEGORY = '경제'
order by B.PUBLISHED_DATE asc;

-- 조건별로 분류하여 주문상태 출력하기
select ORDER_ID, PRODUCT_ID, DATE_FORMAT(OUT_DATE, '%Y-%m-%d') as OUT_DATE,
       case when OUT_DATE > '2022-05-01' then '출고대기'
            when OUT_DATE <= '2022-05-01' then '출고완료'
            else '출고미정'
           end as 출고여부
from FOOD_ORDER
order by ORDER_ID asc;

-- 성분으로 구분한 아이스크림 총 주문량
select A.INGREDIENT_TYPE, sum(B.TOTAL_ORDER) as TOTAL_ORDER
from ICECREAM_INFO A,  FIRST_HALF B
where A.FLAVOR = B.FLAVOR
group by A.INGREDIENT_TYPE
order by B.TOTAL_ORDER

select A.INGREDIENT_TYPE, sum(B.TOTAL_ORDER) as TOTAL_ORDER
from FIRST_HALF B
inner join ICECREAM_INFO A
on A.FLAVOR = B.FLAVOR
group by A.INGREDIENT_TYPE
order by B.TOTAL_ORDER

--     조건에 맞는 도서 리스트 출력하기
select BOOK_ID,
       DATE_FORMAT(PUBLISHED_DATE, '%Y-%m-%d') as PUBLISHED_DATE
from BOOK
where CATEGORY = '인문' and YEAR(PUBLISHED_DATE) = 2021
order by PUBLISHED_DATE;

-- 없어진 기록 찾기
select B.ANIMAL_ID, B.NAME
from ANIMAL_INS as A right join  ANIMAL_OUTS as B on A.ANIMAL_ID = B.ANIMAL_ID
where A.ANIMAL_ID is null and B.ANIMAL_ID is not null
order by B.ANIMAL_ID










