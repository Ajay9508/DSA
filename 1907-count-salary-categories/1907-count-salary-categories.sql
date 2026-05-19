# Write your MySQL query statement below
-- select 'Low Salary' as category,count(*) as accounts_count from Accounts
-- where  income<20000
-- union 
-- select 'Average Salary' as category, count(*) as accounts_count from Accounts
-- where income between 20000 and 50000
-- union 
-- select 'High Salary' as category,count(*) as accounts_count from Accounts
-- where income>50000
-- group by category;
-- using join + group by funcation
select c.category,count(a.account_id)as accounts_count FROM
(select 'Low Salary' as category union
select 'Average Salary' as category union
select 'High Salary' as category) c
left join Accounts a on (c.category = 'Low Salary' and a.income<20000)or
(c.category = 'Average Salary' and a.income between 20000 and 50000)or
(c.category = 'High Salary' and a.income>50000)
group by c.category;
-- one more method is case + gruop by