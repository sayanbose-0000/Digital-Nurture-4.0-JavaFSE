-- Write a PL/SQL block that iterates through all customers and sets a flag IsVIP to TRUE for those with a balance over $10,000.

-- PL/SQL block
begin
  for i in (select * from Customers) loop
    if i.balance > 10000 then
        update Customers set is_vip = 1 where cust_id = i.cust_id;
    end if;
  end loop;
end;
/