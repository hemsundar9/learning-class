use learning_system_test;

set FOREIGN_KEY_CHECKS = 0;
truncate table students;
truncate table classes;
set FOREIGN_KEY_CHECKS = 1;

insert into students (email) values
  ('aaa@gmail.com'),
  ('bbb@aol.com'),
  ('ccc@aol.com'),
  ('ddd@aol.com');

insert into klasses (credits, department, fee, name, semester) values
  (4, 'SCIENCE', 500.0, 'Physics', '2017-01-25 00:00:00'),
  (3, 'ENGINEERING', 550.0, 'Electrical EE', '2018-01-25 00:00:00'),
  (2, 'SCIENCE', 430.0, 'DDD', '2019-01-25 00:00:00');