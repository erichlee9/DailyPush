-- 3.Please follow instructions given below.
-- Write a query to display the customer number, customer firstname,account number for the
-- customer’s whose accounts were created after 15th of any month.

-- Display the records sorted in ascending order based on customer number and then by account
-- number. 

select customer_number, FIRSTNAME, account_number
FROM customer_master cm INNER JOIN account_master am
ON cm.customer_number=am.customer_number
where 

    