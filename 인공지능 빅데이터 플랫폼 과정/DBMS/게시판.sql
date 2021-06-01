-- 게시판 테이블 생성 
CREATE TABLE freeboard (  
  idx INT NOT NULL auto_increment,
  title VARCHAR(45) NULL,
  pass varchar(10) null,
  content text NULL,
  wdate datetime null,
  name varchar(20) null,
  email varchar(30) null,
  see int null default 0,
  PRIMARY KEY (idx)
)