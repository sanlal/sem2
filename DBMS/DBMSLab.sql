
/*Q1 */

create table employee(
      SNo varchar2(10),
      Name varchar2(30),
      Designation varchar(30), 
      Branch varchar2(30)
);

--drop table employee;
insert into employee values('&SNo','&Name','&Designation','&Branch');

alter table employee
add Salary varchar2(20);



ALTER TABLE employee
RENAME COLUMN Name to Full_Name ;

DESCRIBE employee;
--pragma table_info(employee);

/*Copy the table employee as emp
*/

delete from employee where SNo = 2;

--copy from employee to emp;


select * from employee;

truncate table employee; 







/*Q2*/

create table Student(
       Rollno varchar2(20),
       Name varchar2(30),
       Dob varchar2(20),
       Gender varchar(20),
       Doa date,
       Bcode varchar2(20),
       PRIMARY KEY(Rollno),
       check(GENDER in ('Male', 'Female', 'Unknown')),
       FOREIGN key(Bcode) references branch(Bcode)
--       CONSTRAINT Const_Doa CHECK(Doa <= "12-09-2019")
       );

insert into employee values('&Rollno','&Name','&Dob','&Gender','&Doa','&Bcode');
--drop table Student;
       
create table Branch(
       Bcode varchar2(20) ,
       Bname varchar2(20),
       Dno VARCHAR2(20),
       Primary Key(Bcode)
       );
       
       

create table Department(
       Dno VARCHAR2(20),
       Dname varchar2(20),
       PRIMARY key(Dno)
       );
       
       
       
create table Course(
       Ccode varchar2(20),
       Cname varchar2(30),
       Credits varchar(20),
       Dno varchar2(20),
        PRIMARY key(Ccode)
       ); 
    
    
    
       
create table Branch_Course(
       Bcode varchar2(20),
       Ccode varchar2(20),
       Semester varchar2(30),
        PRIMARY key(Bcode,Ccode)
       ); 
       
       
       
create table Enrolls(
      Rollno VARCHAR(20) ,
       Ccode varchar2(20),
       Sess varchar2(30) ,
       Grade varchar2(20),
       PRIMARY key(Rollno,Ccode,Sess)
       );

       
       /*develop a sql query to list the details of courses that are common for more than 3 branches */
      select * from course 
      where Ccode in (select Branch_Course.Ccode from branch_course 
      group by branch_course.ccode having count(Ccode)>=3);
       
      /*develop a sql query to list students who got 'S' in more than 2 courses during single enrollment*/
      
      select * from
       