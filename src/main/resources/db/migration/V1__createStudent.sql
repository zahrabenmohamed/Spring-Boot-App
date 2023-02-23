
CREATE TABLE IF NOT EXISTS student(
    student_Id UUID PRIMARY KEY NOT NULL,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    gender VARCHAR(6) NOT NULL CHECK(gender='FEMALE' or gender='MALE')

);