--Write an SQL statement to find the total purchase amount of all orders.
SELECT SUM(purchase_amount) AS "Total sum" FROM orders;
--Write an SQL statement to find the average purchase amount of all orders.
select AVG(purchase_amount) AS "Average" from orders;
--Write an SQL statement to get the maximum purchase amount of all the orders.
SELECT MAX(purchase_amount) AS "Maxium" FROM orders;
--Write an SQL statement to get the minimum purchase amount of all the orders.
select MIN(purchase_amount) AS "Minumum" from orders;
--Write an SQL statement to find the number of salesmen listed in the table.
select COUNT(distinct salesman_id) AS "Total count" from orders;