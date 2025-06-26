create table Accounts (
  acc_no number(10) primary key,
  acc_type varchar2(10) check (acc_type in ('Current', 'Savings')),
  balance number(12, 2)
);

create table Employees (
  emp_id number(10) primary key,
  emp_name varchar2(100),
  salary number(12, 2),
  dept varchar2(10) check (dept in ('Manager', 'Back Office', 'Loan Dept', 'Customer Service', 'Front Desk'))
);

-- Data for Accounts Table
INSERT INTO Accounts VALUES (1001, 'Savings', 55000.00);
INSERT INTO Accounts VALUES (1002, 'Current', 120000.50);
INSERT INTO Accounts VALUES (1003, 'Savings', 7500.25);
INSERT INTO Accounts VALUES (1004, 'Savings', 30000.00);
INSERT INTO Accounts VALUES (1005, 'Current', 45000.00);
INSERT INTO Accounts VALUES (1006, 'Savings', 12500.75);

-- Data for Employees Table
INSERT INTO Employees VALUES (1, 'Scott Lang', 95000.00, 'Manager');
INSERT INTO Employees VALUES (2, 'Emil Bronsky', 35000.00, 'Front Desk');
INSERT INTO Employees VALUES (3, 'Agatha Harnkess', 42000.00, 'Customer Service');
INSERT INTO Employees VALUES (4, 'Wade Wilson', 55000.00, 'Loan Dept');
INSERT INTO Employees VALUES (5, 'James Watson', 38000.00, 'Back Office');
INSERT INTO Employees VALUES (6, 'Sherlock Holmes', 36000.00, 'Front Desk');
INSERT INTO Employees VALUES (7, 'Winston Churchill', 50000.00, 'Customer Service');
INSERT INTO Employees VALUES (8, 'Hewlett Packard', 60000.00, 'Loan Dept');

COMMIT;