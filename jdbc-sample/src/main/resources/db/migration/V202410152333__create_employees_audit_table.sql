CREATE TABLE employees_audit(
     id BIGINT not null auto_increment,
     employee_id BIGINT not null,
     name VARCHAR(150),
     old_name VARCHAR(150),
     salary DECIMAL (10,2),
     old_salary DECIMAL (10,2),
     birthday TIMESTAMP,
     old_birthday TIMESTAMP,
     operation CHAR(1),
     created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
     PRIMARY KEY(id)
)engine=InnoDB default charset=utf8;