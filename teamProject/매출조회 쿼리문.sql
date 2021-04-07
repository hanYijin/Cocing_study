--SELET * FROM BUYING;
--select *from buying;
--SELEC
--SELECT * FROM CUSTT * FROM CUSTOMER;
select orderdate, pid,price, count from buying where to_char(orderdate,'yy/mm/dd')=TO_char(sysdate,'yy/mm/dd');

--select id,name from customer where id =5;
--select pid form buying; 
select orderdate,  sum(price* count)  from buying group by orderdate having to_char(orderdate,'yy/mm/dd')=TO_char(sysdate,'yy/mm/dd');

select orderdate, sum(price* count) from buying group by orderdate having to_char(orderdate,'yy/mm/dd')=TO_char(sysdate,'yy/mm/dd');