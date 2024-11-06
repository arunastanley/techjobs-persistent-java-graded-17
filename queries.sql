--Part 1

-- table Job(
-- id int primary key auto_increment,
-- name varchar,
-- employer varchar,
-- skills varchar
-- );


--Part 2
SELECT name
FROM employer
where location = "St. Louis City";

--Part 3
DROP table job;

--Part 4
SELECT * FROM skill
LEFT JOIN job_skills ON(skill.id=job_skills.skills_id)
WHERE job_skills.jobs_id IS NOT NULL
ORDER BY name ASC;

