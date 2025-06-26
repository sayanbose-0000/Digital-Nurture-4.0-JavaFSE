-- Write a stored procedure UpdateEmployeeBonus that updates the salary of employees in a given department by adding a bonus percentage passed as a parameter

create or replace procedure UpdateEmployeeBonus (d_name in varchar2, bonus in number) is
begin
  update Employees set salary = salary + ((bonus / 100) * salary) where dept = d_name;
end;
/