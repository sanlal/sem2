
/*

WorksOnDatabase:
   emp(eno,ename,bdate,title,salary,dno)
   proj(pno,pname,budget,dno)
   dept(dno,dname,mgreno)
   workson(eno,pno,resp,hours)

*/

/*  emp(eno,ename,bdate,title,salary,dno) */
create table emp(
   eno varchar2(30),
   ename varchar2(30),
   bdate varchar2(30),
   title varchar2(30),
   salary varchar2(30),
   dno varchar2(30)
   );
 
insert into emp VALUES('&eno','&ename','&bdate','&title','&salary','&dno');
select * from emp;


/*  proj(pno,pname,budget,dno)*/

create table proj(
    pno varchar2(30),
    pname varchar2(30),
    budget varchar2(30),
    dno varchar2(30)
    );

insert into proj values('&pno','&pname','&budget','&dno');
select * from proj;

/*  dept(dno,dname,mgreno)*/

create table dept(
    dno varchar2(30),
    dname varchar2(30),
    mgreno varchar2(30)
    );

insert into dept values('&dno','&dname','&mgreno');
select * from dept;


/* workson(eno,pno,resp,hours) */

create table workson(
    eno varchar2(30),
    pno varchar2(30),
    resp varchar2(30),
    hours varchar2(30)
    );

insert into workson values('&eno','&pno','&resp','&hours');

select * from workson;


/*
1)Write an SQL query that returns the project number and name for projects with a budget greater than $100,000.
*/
SELECT pno, pname 
FROM proj WHERE budget > 100000;

/* 
2)Write an SQL query that returns all workson records where hours worked is less than 10 and the responsibility is 'Manager'.
*/

SELECT * 
FROM workson 
WHERE hours < 10 AND resp = 'Manager';


/* 
3)Write an SQL query that returns the employees(number and name only)who have a title of 'EE'or'SA'and make more than $35,000.
*/
SELECT eno, ename
FROM emp 
WHERE (title = 'EE' 
OR title = 'SA') 
AND salary > 35000;


/* 
4)Write an SQL query that returns the employees(name only)in department'D1' ordered by decreasing salary.
*/
SELECT ename
FROM emp 
WHERE dno = 'D1' 
ORDER BY salary DESC;


/* 
5)Write an SQL query that returns the departments(all fields)ordered by ascending department name.
*/
SELECT * 
FROM dept 
ORDER BY dname ASC;


/* 
6)Write an SQL query that returns the employee name,department name,and employee title.
*/
SELECT emp.ename, dept.dname, emp.title 
FROM emp 
INNER JOIN dept 
ON emp.dno = dept.dno;



/* 
7)Write an SQL query that returns the project name , hours worked,and project number
 for all workson records where hours>10.
*/
SELECT proj.pname, workson.hours, workson.pno 
FROM workson 
INNER JOIN proj 
ON workson.pno = proj.pno 
WHERE workson.hours > 10;



/* 
8)Write an SQL query that returns the project name,department name,and budget for all projects with a budget < $50,000.
*/
SELECT proj.pname, dept.dname, proj.budget 
FROM proj 
INNER JOIN dept 
ON proj.dno = dept.dno 
WHERE proj.budget < 50000;



/* 
9)Write an SQL query that returns the employee numbers and salaries of all employees in the 'Consulting' department ordered by descending salary.
*/
SELECT eno, salary 
FROM emp 
INNER JOIN dept 
ON emp.dno = dept.dno 
WHERE dept.dname = 'Consulting' 
ORDER BY salary DESC;

/* 
10)Write an SQL query that returns the employee name,project name,employee title,and hours for all workson records.
*/
SELECT emp.ename, proj.pname, emp.title, workson.hours 
FROM emp 
INNER JOIN workson 
ON emp.eno = workson.eno 
INNER JOIN proj 
ON workson.pno = proj.pno;



