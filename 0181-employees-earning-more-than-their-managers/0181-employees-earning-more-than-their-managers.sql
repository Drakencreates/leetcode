# Write your MySQL query statement below

SELECT e.name Employee FROM Employee e
LEFT JOIN Employee m ON e.ManagerId = m.id
WHERE e.salary > m.salary;