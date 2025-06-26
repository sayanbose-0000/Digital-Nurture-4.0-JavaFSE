-- Write a PL/SQL block that loops through all customers, checks their age, and if they are above 60, apply a 1% discount to their current loan interest rates

-- PL/SQL block
begin
  for i in (select * from Customers C join Loans L on C.cust_id = L.cust_id) loop
    if (trunc((sysdate - i.dob) / 365)) > 60 then
        update loans set roi = 0.99 * roi where loan_id = i.loan_id;
    end if;
  end loop;
end;
/