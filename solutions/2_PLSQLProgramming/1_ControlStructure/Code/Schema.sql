-- -- Customer table
-- create table Customers (
--   cust_id number(10) primary key,
--   cust_name varchar2(100),
--   dob date
-- );

-- -- Insert customers
-- INSERT INTO customers VALUES (1, 'John Smith', TO_DATE('1950-05-20', 'YYYY-MM-DD'));
-- INSERT INTO customers VALUES (2, 'Alice Brown', TO_DATE('1985-10-15', 'YYYY-MM-DD'));
-- INSERT INTO customers VALUES (3, 'David Green', TO_DATE('1948-03-05', 'YYYY-MM-DD'));
-- INSERT INTO customers VALUES (4, 'Maria White', TO_DATE('1990-07-12', 'YYYY-MM-DD'));

-- -- Loan table
-- create table Loans (
--   loan_id number(10) primary key,
--   cust_id number(10) references Customers(cust_id),
--   roi number(5,2)
-- );

-- -- Insert loans
-- INSERT INTO loans VALUES (101, 1, 7.50);
-- INSERT INTO loans VALUES (102, 2, 6.80);
-- INSERT INTO loans VALUES (103, 3, 8.20);
-- INSERT INTO loans VALUES (104, 4, 7.00);

-- select C.cust_id, C.cust_name, C.dob, L.loan_id, L.roi from Customers C join Loans L on C.cust_id = L.cust_id;

-- Customer Schema
create table Customers (
  cust_id number(10) primary key,
  cust_name varchar(100),
  dob date,
  balance number(12,2),
  is_vip number(1) default 0 check (is_vip in (0,1))
);

-- Inserting into Customers
INSERT INTO Customers VALUES (1, 'Steve Rogers', TO_DATE('15-01-1952','DD-MM-YYYY'), 12000.00, 0);
INSERT INTO Customers VALUES (2, 'Carol Denvers', TO_DATE('22-06-1988','DD-MM-YYYY'), 8500.00, 0);
INSERT INTO Customers VALUES (3, 'Tony Stark', TO_DATE('10-09-1945','DD-MM-YYYY'), 11000.00, 0);
INSERT INTO Customers VALUES (4, 'Peter Parker', TO_DATE('05-03-1992','DD-MM-YYYY'), 9500.00, 0);
INSERT INTO Customers VALUES (5, 'Bruce Banner', TO_DATE('30-12-1978','DD-MM-YYYY'), 15000.00, 0);


-- Loans Schema
create table Loans (
  loan_id number(10) primary key,
  cust_id number(10) references Customers(cust_id),
  roi number(5,2),
  due_date date
);

-- Inserting into Loans
INSERT INTO Loans VALUES (201, 1, 7.50, TO_DATE('21-07-2025','DD-MM-YYYY'));
INSERT INTO Loans VALUES (202, 2, 6.80, TO_DATE('25-09-2025','DD-MM-YYYY'));
INSERT INTO Loans VALUES (203, 3, 8.20, TO_DATE('06-07-2025','DD-MM-YYYY'));
INSERT INTO Loans VALUES (204, 4, 7.00, TO_DATE('15-08-2025','DD-MM-YYYY'));
INSERT INTO Loans VALUES (205, 5, 7.30, TO_DATE('01-07-2025','DD-MM-YYYY'));

-- Query
select C.cust_id, C.cust_name, C.dob, C.balance, C.is_vip, L.loan_id, L.roi, L.due_date from Customers C join Loans L on C.cust_id = L.cust_id;