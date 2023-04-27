
      
      
CREATE TABLE ACTOR (
  id INT NOT NULL PRIMARY KEY,
  fname VARCHAR(50),
  lname VARCHAR(50),
  gender VARCHAR(10)
);

INSERT INTO ACTOR VALUES('&id','&fname','&lname','&gender');

select * from actor;


CREATE TABLE MOVIE (
  id INT NOT NULL PRIMARY KEY,
  name VARCHAR(100),
  year INT,
  rank INT
);
INSERT INTO MOVIE VALUES('&id','&name','&year','&rank');

select * from movie;


CREATE TABLE DIRECTOR (
  id INT NOT NULL PRIMARY KEY,
  fname VARCHAR(50),
  lname VARCHAR(50)
);
INSERT INTO DIRECTOR VALUES('&id','&fname','&lname');

select * from director;


CREATE TABLE CAST (
  pid INT,
  mid INT,
  role VARCHAR(50),
  PRIMARY KEY (pid, mid),
  FOREIGN KEY (pid) REFERENCES ACTOR(id),
  FOREIGN KEY (mid) REFERENCES MOVIE(id)
);

INSERT INTO CAST VALUES('&pid','&mid','&role');

select * from cast;



CREATE TABLE MOVIE_DIRECTOR (
  did INT,
  mid INT,
  PRIMARY KEY (did, mid),
  FOREIGN KEY (did) REFERENCES DIRECTOR(id),
  FOREIGN KEY (mid) REFERENCES MOVIE(id)
);

INSERT INTO MOVIE_DIRECTOR VALUES('&did','&mid');

select * from MOVIE_DIRECTOR;





SELECT DIRECTOR.fname, DIRECTOR.lname, COUNT(MOVIE_DIRECTOR.mid) AS num_films_directed
FROM DIRECTOR 
JOIN MOVIE_DIRECTOR ON DIRECTOR.id = MOVIE_DIRECTOR.did
GROUP BY id, DIRECTOR.fname, DIRECTOR.lname
ORDER BY num_films_directed DESC;


SELECT ACTOR.fname, ACTOR.lname
FROM ACTOR
LEFT JOIN CAST ON ACTOR.id = CAST.pid
LEFT JOIN MOVIE ON CAST.mid = MOVIE.id
WHERE year > 1960 OR year IS NULL
GROUP BY ACTOR.id, ACTOR.fname, ACTOR.lname
HAVING COUNT(CAST.pid) = COUNT(year);




SELECT ACTOR.fname, ACTOR.lname, MOVIE.name, MOVIE.year
FROM ACTOR
JOIN CAST ON ACTOR.id = CAST.pid
JOIN MOVIE ON CAST.mid = MOVIE.id

ORDER BY ACTOR.lname;


SELECT MOVIE.name, COUNT(CASE WHEN ACTOR.gender = 'female' THEN 1 END) AS num_female_actors, 
COUNT(CASE WHEN ACTOR.gender = 'male' THEN 1 END) AS num_male_actors
FROM MOVIE
JOIN CAST ON  CAST.mid = MOVIE.id
JOIN ACTOR ON CAST.pid = ACTOR.id
GROUP BY MOVIE.id, MOVIE.name
     HAVING num_female_actors > num_male_actors;


































--SELECT d.fname, d.lname, COUNT(md.mid) AS num_films_directed 
--FROM DIRECTOR d 
--LEFT JOIN MOVIE_DIRECTOR md ON d.id = md.did 
--GROUP BY d.id 
--ORDER BY num_films_directed DESC;
--
--
--SELECT a.fname, a.lname
--FROM ACTOR a
--LEFT JOIN CAST c ON a.id = c.pid
--LEFT JOIN MOVIE m ON c.mid = m.id
--WHERE m.year >= 1960 OR m.year IS NULL
--GROUP BY a.id
--HAVING COUNT(DISTINCT CASE WHEN m.year >= 1960 THEN m.id END) = 0;
--
--
--
--SELECT a.fname, a.lname, MIN(m.year) AS debut_year, GROUP_CONCAT(DISTINCT m.name SEPARATOR ', ') AS debut_movies 
--FROM ACTOR a 
--LEFT JOIN CAST c ON a.id = c.pid 
--LEFT JOIN MOVIE m ON c.mid = m.id 
--GROUP BY a.id 
--ORDER BY a.lname ASC;
--
--
--
--SELECT m.name, COUNT(DISTINCT CASE WHEN a.gender = 'Female' THEN c.pid END) AS num_female_actors, COUNT(DISTINCT CASE WHEN a.gender = 'Male' THEN c.pid END) AS num_male_actors 
--FROM MOVIE m 
--LEFT JOIN CAST c ON m.id = c.mid 
--LEFT JOIN ACTOR a ON c.pid = a.id 
--GROUP BY m.id 
--HAVING num_female_actors > num_male_actors;
--
--












      
      