select name 
from employee
where id IN (
    select managerid
    from employee
    where managerid is not null
    group by managerid
    having count(*) >= 5
)