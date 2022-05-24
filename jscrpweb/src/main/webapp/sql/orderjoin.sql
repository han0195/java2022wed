select * from porder; -- 2줄
select * from porderdetail; -- 2줄
-- 1. 필드에 별칭 as
-- 2. 테이블에 별칭 띄어쓰기

-- 1.
select * from porder A , porderdetail B, stock C, product D 
where A.orderno = B.orderno and B.sno = C.sno and C.pno = D.pno;
-- 2.
select * from porder A join porderdetail B on A.orderno = B.orderno
join stock C on B.sno = C.sno
join product D on C.pno = D.pno;

--
select
A.orderno as 주문번호,
A.orderdate as 주문일,
B.orderdetailno as 주문상세번호,
B.orderdetailactive as 주문상세상태,
B.samount as 주문상세수량,
C.sno as 재고번호,
C.scolor as 색상,
C.ssize as 사이즈,
D.pno as 제품번호,
D.pname as 제품명,
D.pimg as 제품사진
from porder A join porderdetail B on A.orderno = B.orderno
join stock C on B.sno = C.sno
join product D on C.pno = D.pno where A.mno=47 order by A.orderno asc;