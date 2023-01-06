USE bdtest2;
SHOW TABLES;
#select * from dept
SELECT * FROM emp;

SELECT empno,ename
FROM emp
ORDER BY empno DESC;

#LIMIT 分页操作
SELECT empno ,ename
FROM emp
#order by empno desc
LIMIT 2,2;



SELECT * 
FROM emp
#where deptno in (10,30)
GROUP BY deptno;

SELECT * FROM dept;




SELECT e.ename,e.empno
FROM emp AS e,dept AS d
WHERE e.`deptno`=e.`deptno`;


#SQL99语法
SELECT e.ename,e.empno
FROM emp e JOIN dept d
ON e.deptno = e.`deptno`;



#自然链接
SELECT e.empno ,e.ename,d.deptno
FROM emp e NATURAL JOIN dept d; 


#pi()=3.141593
SELECT 7*PI() AS are_a;

#rand()函数取随机数
SELECT RAND(),RAND();

#四舍五入round
SELECT ROUND(1.2),ROUND(1.5);
#截断操作
SELECT TRUNCATE(12.21332,2);

SELECT SIN(RADIANS(30));

#指数和对数
SELECT EXP(LN(3)),POW(2,3);

#获取日期，时间
SELECT CURDATE();# 显示年月日
SELECT CURTIME();# 显示时分秒
SELECT NOW();# 显示年月日时分秒
SELECT UTC_DATE(),UTC_TIME();

# 日期和时间戳的转换
SELECT UNIX_TIMESTAMP(NOW());# 时间戳
SELECT FROM_UNIXTIME(1672842503);# 将时间戳转换成日期
SELECT UNIX_TIMESTAMP(),FROM_UNIXTIME(UNIX_TIMESTAMP()),
UNIX_TIMESTAMP('2021-11-30 03-38'),FROM_UNIXTIME(1638214680)
from dual;

# 获取月份，星期，星期数，天数等函数
select year(curdate()),month(curdate()),day(curdate()),
hour(curtime()),minute(curtime()),second(now())
from dual;

# 时间的加减 date_add()加 date_sub减
select date_add(now(), interval 1 year) coll_1,
date_add('2021-1-31 23:02:01',interval '1_1' day_hour);

select addtime(now(),120),subtime(now(),'03:01:59'),
datediff(now(),'2022-1-4')

# IF函数
select ename,sal,if(sal <3000,'低工资','正常工资')  as '工资水平'
from emp;