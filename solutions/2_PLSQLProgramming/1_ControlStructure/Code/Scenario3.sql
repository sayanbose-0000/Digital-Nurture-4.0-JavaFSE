-- Write a PL/SQL block that fetches all loans due in the next 30 days and prints a reminder message for each customer

-- PL/SQL block
begin
  for i in (select C.cust_id, C.cust_name, c.dob, c.balance, c.is_vip, l.loan_id, l.roi, l.due_date from Customers C join Loans L on C.cust_id = L.cust_id where L.due_date <= sysdate + 30) loop
    dbms_output.put_line(i.cust_name || ' (id: ' || i.cust_id || ') ' || 'has loan due for this month. Please Pay in the next ' || trunc(sysdate + 30 - i.due_date) || ' days');
  end loop;
end;
/