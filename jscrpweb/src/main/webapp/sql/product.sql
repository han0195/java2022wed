create table category(
	cno int primary key auto_increment ,  /* 카테고리 번호 */
    cname varchar(100) /* 카테고리 이름 */
);
create table product(
	pno int primary key auto_increment ,
    pname varchar(1000) ,
    pprice int ,
    pdiscount float ,
    pactive int default 0,
	pimg varchar(1000) ,
    cno int ,
    foreign key( cno ) references category(cno) on update cascade 
);

create table stock( 
	sno int primary key auto_increment , /* 재고 번호 */
    scolor varchar(100) ,  /* 재고 색상 */
    ssize varchar(100) ,   /* 재고 색상 */
    samount int ,   /* 재고 수량 */
    firstdate datetime default now(),   /* 재고 최초등록일 */
	updatedate datetime default now() on update now(),  /* 재고 최근수정일 */
    pno int ,  /* 제품 번호 */
    foreign key( pno ) references product(pno) on delete cascade
    /* 레코드가 변경되면 자동으로 현재날짜를 부여 */
    /* default : 값이 안들어왔을때 초기값 설정 */
    /* on update : 레코드가 변경 되었을때 값 설정 */ 
    /* on delete cascade : pk 레코드가 삭제 되면 fk 레코드 도 같이 삭제된다 */
);

/* 한 명령어( ; 기준 = 커서위치 ) 씩 실행단축키 = ctrl+엔터 */






