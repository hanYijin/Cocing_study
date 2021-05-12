CREATE TABLE spro.daegu (
  idx INT NOT NULL,
  name VARCHAR(45) NULL,
  location VARCHAR(45) NULL,
  code1 VARCHAR(45)NULL,
  code1_name VARCHAR(45) NULL,
  code2 VARCHAR(45)NULL,
  code2_name VARCHAR(45) NULL,
  code_3 VARCHAR(45)NULL,
  code4 VARCHAR(45)null,
  code4_name varchar(45) null,
  code_sido VARCHAR(45)null,
  code_sidoname varchar(45) null,
  code_gu VARCHAR(45)null,
  code_guname varchar(45) null,
  code_dong VARCHAR(45)null,
  code_dongname varchar(45) null,
  code_legar VARCHAR(45)null,
  code_legarname varchar(45) null,
  code_jibun VARCHAR(45)null,
  code_jibunname varchar(45) null,
  code_gubun VARCHAR(45)null,
  code_gubunname varchar(45) null,
  jibon_bon varchar(45) null,
  jibon_bu varchar(45) null,
  jibon_addr varchar(45) null,
  code_doro VARCHAR(45)null,
  code_doroname varchar(45) null,
  building_bon varchar(45) null,
  building_bu varchar(45) null,
  building_num varchar(45) null,
  building_name varchar(45) null,
  doro_addr varchar(45) null,
  oldzip varchar(45) null,
  newzip varchar(45) null,
  donginfo varchar(45) null,
  floorinfo varchar(45) null,
  hoinfo varchar(45) null,
  longitude varchar(45) null,
  latitude varchar(45) null,
  PRIMARY KEY (idx))
COMMENT = '상가업소번호|상호명|지점명|상권업종대분류코드|상권업종대분류명|상권업종중분류코드
		|상권업종중분류명|상권업종소분류코드|표준산업분류코드|표준산업분류명|시도코드
        |시도명|시군구코드|시군구명|행정동코드|행정동명|법정동코드|법정동명|지번코드
        |대지구분코드|대지구분명|지번본번지|지번부번지|지번주소|도로명코드
        |도로명|건물본번지|건물부번지|건물관리번호|건물명|도로명주소
        |구우편번호|신우편번호|동정보|층정보|호정보|경도|위도
        ';
        
select code_jibun,code1_name,count(*) from deagu
group by code_jibun, code1_name
having code_jibun='신천동';

SELECT * FROM daegu order by idx limit 0, 10;covidnumnum