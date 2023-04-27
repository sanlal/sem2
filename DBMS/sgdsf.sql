declare 
   c_name instructor.name%type;
   c_sal instructor.salary%type;
BEGIN 
   select name, MAX(salary) AS salary  into c_name, c_sal
   from instructor 
    WHERE salary <> (SELECT MAX(salary) FROM instructor);)
    dbms_output.put_line('instructor' ||c_name || ' salary'||c_sal;
END;
/
    