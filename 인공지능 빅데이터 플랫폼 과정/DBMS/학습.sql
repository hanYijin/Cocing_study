-- SELECT ���̸� FROM ���̺�� WHERE ����;
-- ������ ������ ������� ó���� ������ ��ȸ (��ǰ��, ��ǰ�̸� ����, ���, ����)
SELECT PID, PNAME,category,stock, price FROM product
WHERE category='����';

select * from indextbl where first_name='JACK';
-- �ε��� ����(�̸������� ��� ���� ������ �ε������� �� �� �ֵ��� ����)
create index idx_indextbl_firstname on indextbl(first_name);

--�� 
create view shop.product_view as
select pid, pname, category from shop.product;


select count(*) from product;
select count(*) from indextbl;