/* 
DATE: 30/01/2023 
GROUP BY, ORDERED BY, WHERE CLAUSE, FILTER, RETRIVE ROWS AND COLOUMNS, UNIQUE ROWS AND COLUMNS
 */

create table instructor(
      ID varchar2(10),
      name varchar2(10),
      dept_Name varchar(10), 
      salary varchar2(10)
);
insert into instructor values('&ID','&name','&dept_Name','&salary');

UPDATE instructor
SET salary_2nd = '2000'
WHERE ID = 1;

select * from instructor;



alter table instructor
add salary_2nd varchar2(10);

add  age varchar2(10);



/*GROUP BY */
select dept_name
from instructor
group by dept_name;


select dept_name, COUNT(*)AS 
from instructor
group by dept_name;


/*sum of salary */
select  SUM(salary)
from instructor;


/*Grouping similar salary*/
select id, SUM(salary)AS total
from instructor
group by id;




SELECT dept_name, name, MIN(age) as min_age
FROM instructor
GROUP BY dept_name, name;



/*ORDER BY */
select SALARY
from instructor
order by salary ASC;



/*WHERE */
select SALARY
from instructor
where salary>=40000;


select id
from instructor
where id>=4;




select * from instructor;






/*06/02/2023 JOINS */


/*
CREATING TABLES 
1.MARTIAN
2.BASE
3.VISITOR
4.INVENTORY
5.SUPPLY
*/

/* MARTIAN TABLE */
create table martian(
      martian_id varchar2(10),
      first_name varchar2(10),
      last_name varchar2(10),
      base_id varchar(10), 
      super_id varchar2(10)
);
insert into martian values('&martian_id','&first_name','&last_name','&base_id','&super_id');



/* BASE TABLE */
create table base(
      base_id varchar2(10),
      base_name varchar2(30),
      founded varchar2(30)
);
insert into base values('&base_id','&base_name','&founded');
select * from base;




/* VISITOR TABLE */
create table visitor(
      visitor_id varchar2(10),
       host_id varchar(10), 
      first_name varchar2(20),
      last_name varchar2(20)
     
);
insert into visitor values('&visitor_id','&host_id','&first_name','&last_name');




/* INVENTORY TABLE */
create table inventory(
      base_id varchar2(10),
      supply_id varchar2(30),
      quantity varchar2(30)
);
insert into inventory values('&base_id','&supply_id','&quantity');




/* SUPPLY TABLE */
create table supply(
      supply_id varchar2(10),
      name varchar2(30),
      description varchar2(50),
      quantity varchar2(30)
);
insert into supply values('&supply_id','&name','&description','&quantity');

/* NATURAL JOIN */
SELECT *
FROM martian
NATURAL JOIN base;



/* INNER JOIN */
SELECT *
FROM martian
INNER JOIN base
ON martian.base_id = base.base_id;


SELECT first_name, last_name, base_name
FROM martian
INNER JOIN base
ON martian.base_id = base.base_id;

/* ambigiuty due to base_id    It gives error */
SELECT martian_id, base_id, base_name
FROM martian
INNER JOIN base
ON martian.base_id = base.base_id;


/*To remove ambiguity we use there table name */
SELECT martian.martian_id, base.base_id, base.base_name
FROM martian
INNER JOIN base
ON martian.base_id = base.base_id;



/* INNER JOIN for visitors */

SELECT visitor.first_name, visitor.last_name, martian.first_name, martian.last_name
FROM visitor
INNER JOIN martian
ON visitor.host_id = martian.martian_id;

/* LEFT JOIN */

/* WE USE LEFT JOIN SO THAT EVERY VISITOR INCLUDED EVEN THOSE WITHOUT A HOST */

SELECT visitor.first_name, visitor.last_name, martian.first_name, martian.last_name
FROM visitor
LEFT JOIN martian
ON visitor.host_id = martian.martian_id;

/* RIGHT JOIN */
/* WE USE RIGHT JOIN SO THAT EVERY VISITOR INCLUDED EVEN THOSE WITHOUT A HOST */
SELECT visitor.first_name, visitor.last_name, martian.first_name, martian.last_name
FROM visitor
RIGHT JOIN martian
ON visitor.host_id = martian.martian_id;

/* FULL JOIN */
/* all DATA */
SELECT visitor.first_name, visitor.last_name, martian.first_name, martian.last_name
FROM visitor
FULL JOIN martian
ON visitor.host_id = martian.martian_id;








/*Repeatedly typing there TABLE NAME can make queries a bit word 
For this we use AS to give ALIAS */

/* Syntax for AS clause */
SELECT martian_id AS ID, base_id AS ba
FROM martian;













/* bUT i AM SAD TO SEE the select occupies two rows again */



/* Error */
SELECT v.first_name AS visitor_fn , v.last_name AS vistor_ln , m.first_name AS martian_fn , m.last_name AS martian_ln
FROM visitor AS v
LEFT JOIN martian AS m
ON v.host_id = m.martian_id;



SELECT *
FROM martian AS m
INNER JOIN martian AS s
ON m.super_id = s.martian_id
ORDER BY m.martian_id;






























-
-



















