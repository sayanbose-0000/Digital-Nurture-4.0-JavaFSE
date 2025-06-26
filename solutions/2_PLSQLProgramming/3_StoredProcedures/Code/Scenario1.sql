-- Write a stored procedure ProcessMonthlyInterest that calculates and updates the balance of all savings accounts by applying an interest rate of 1% to the current balance.

create or replace procedure ProcessMonthlyInterest is
Begin
  update accounts set balance = balance * 1.01 where acc_type = 'Savings';
End;
/