SELECT MAX(CASE WHEN rnk = 2 THEN salary END) AS SecondHighestSalary
FROM (
    SELECT salary,
           DENSE_RANK() OVER (ORDER BY salary DESC) AS rnk
    FROM Employee
) AS t;
