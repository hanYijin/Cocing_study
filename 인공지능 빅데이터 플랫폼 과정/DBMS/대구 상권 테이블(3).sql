delete from daegu;
select * from daegu;
set sql_safe_updates=0;
DELETE FROM daegu;
select * from member;

select * from seat_use;
select *from daegu
limit 0, 100;

SELECT * FROM daegu order by idx limit 0, 10;
SELECT * FROM daegu order by idx limit 10, 10;

-- code2_name 분류별 갯수
select code2_name as name, count(*) as cnt from daegu
group by code2_name
order by cnt asc
limit 0,10;
-- code4 분류별 갯수
select code4, count(*) as cnt from daegu 
group by code4 
having cnt> 30
order by cnt asc limit 0,100;

select * from member;
-- 111584 / 10 = 
select count(*) from daegu;
-- pagecnt==1 -> 0
-- pagecnt == 2 ->10
-- pagecnt == 3 ->20
select * from daegu
limit 30,10;

select * from covid;