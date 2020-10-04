-- 3.Please follow instructions given below.
-- Write a query to display the customer number, customer firstname,account number for the
-- customer’s whose accounts were created after 15th of any month.

-- Display the records sorted in ascending order based on customer number and then by account
-- number. 

-- SELECT cm.customer_number, FIRSTNAME, am.account_number        ****************this didn't work?????
-- FROM customer_master cm INNER JOIN account_master am
-- ON cm.customer_number=am.customer_number
-- where day in account_opening_date > 15
-- order by customer_number

-- 4.Please follow instructions given below.
-- Write a query to display customer number, customer's first name, account number where the account
-- status is terminated.
-- Display the records sorted in ascending order based on customer number and then by account
-- number.
-- select am.customer_number, cm.FIRSTNAME, am.account_number
-- FROM customer_master cm INNER JOIN account_master am
-- ON cm.customer_number=am.customer_number
-- where account_status = 'terminated'
-- order by account_number

-- 5.Please follow instructions given below.
-- Write a query to display the total number of withdrawals and total number of deposits being done
-- by customer whose customer number ends with 001. The query should display transaction type and
-- the number of transactions. Give an alias name as Trans_Count for number of transactions.
-- Display the records sorted in ascending order based on transaction type. 

-- Select  transaction_type,count(transaction_number) Trans_Count   *********this doesn't work, only counts as deposits.
-- FROM transaction_details td INNER JOIN account_master am
-- ON td.account_number=am.account_number
-- where customer_number like '%001'
-- order by transaction_type

-- 6.Please follow instructions given below.
-- Write a query to display the number of customers who have registration but no account in the bank.
-- Give the alias name as Count_Customer for number of customers. 

-- Select count(customer_number) count_customer       ******doesn't work, gives count of all customers 
-- from account_master
-- where account_number not in  (SELECT customer_number FROM account_master) 

-- 7.Please follow instructions given below.
-- Write a query to display account number and total amount deposited by each account holder (
-- Including the opening balance ). Give the total amount deposited an alias name of Deposit_Amount.
-- Display the records in sorted order based on account number. 



