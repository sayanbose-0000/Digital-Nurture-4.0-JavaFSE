-- Write a stored procedure TransferFunds that transfers a specified amount from one account to another, 
-- checking that the source account has sufficient balance before making the transfer.

create or replace procedure TransferFunds (send_acc_no in number, recv_acc_no in number, amnt in number) is

curr_val number; -- declare vars here

begin
  select balance into curr_val from Accounts where acc_no = send_acc_no;
  
  if curr_val < amnt then
    DBMS_OUTPUT.PUT_LINE('Not sufficient balance');
  else
    update Accounts set balance = balance - amnt where acc_no = send_acc_no;
    update Accounts set balance = balance + amnt where acc_no = recv_acc_no;
  end if;
end;
/