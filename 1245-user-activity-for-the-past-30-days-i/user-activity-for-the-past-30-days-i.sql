# Write your MySQL query statement below
SELECT activity_date as day,count(distinct user_id) as active_users
FROM Activity
where
DATEDIFF('2019-07-27',activity_date) between 0 and 29
group by activity_date;