/* Q1 */

create table instructor(
      ID varchar2(10),
      name varchar2(10),
      dept_Name varchar(10), 
      salary varchar2(10)
);
insert into instructor values('&ID','&name','&dept_Name','&salary');

/*GROUP BY */
select dept_name
from instructor
group by dept_name;


/*ORDER BY */
select SALARY
from instructor
order by salary ASC;

/*WHERE */
select SALARY
from instructor
where salary>=40000;


select dept_name, COUNT(*)AS 
from instructor
group by dept_name;


select salary, SUM(amount)AS total
from instructor
group by salary;



select * from instructor;




/* Q2 */


create table department_relation(dept_name varchar2(10),building varchar(10), budget varchar2(10));
select * from department_relation;
insert into department_relation values('&dept_name','&building','&budget');


/*DATE: 30/01/2023 
GROUP BY, ORDERED BY, WHERE CLAUSE, FILTER, RETRIVE ROWS AND COLOUMNS
*/

