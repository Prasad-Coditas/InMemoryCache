# In Memory Cache

<b>LRU Cache Implementation Using Java LinkedHashMap</b>

LRU cache stand for Least Recently Used Cache. which evict least recently used entry. As Cache purpose is to provide fast and efficient way of retrieving data. it need to meet certain requirement.
Some of the Requirement are
Fixed Size: Cache needs to have some bounds to limit memory usages.
Fast Access: Cache Insert and lookup operation should be fast , preferably O(1) time.
Replacement of Entry in case , Memory Limit is reached: A cache should have efficient algorithm to evict the entry when memory is full.

Here I have given 5 limit or size of map, so in output it shows most recently added/updated data in linked hashmap.

10 records added and it returns recently added/updated 5 records as its size/limit is 5.

After showing all records, flushCashe() method gets called to flush the data inside the cache.

<b>Input :</b> <br>
Employee{employeeId=1009, employeeName='Sada', salary=90000.0, email='sada@coditas.com'}==>Department{deptId=10001, deptName='IT', deptLocation='Pune'}
Employee{employeeId=2009, employeeName='Rakesh', salary=30000.0, email='rakesh@coditas.com'}==>Department{deptId=10001, deptName='IT', deptLocation='Pune'}
.<br>
.<br>
.<br>
Employee{employeeId=10009, employeeName='Jumbad', salary=180000.0, email='ajay@coditas.com'}==>Department{deptId=10002, deptName='Finance', deptLocation='Mumbai'}

<b>Output :</b> <br>
---> Showing recently cached data as per limit <---<br>
Employee{employeeId=6009, employeeName='Jadhav', salary=190000.0, email='sada@coditas.com'}==>Department{deptId=10001, deptName='IT', deptLocation='Pune'}
.<br>
.<br>
.<br>
Employee{employeeId=10009, employeeName='Jumbad', salary=180000.0, email='ajay@coditas.com'}==>Department{deptId=10002, deptName='Finance', deptLocation='Mumbai'}
<br>
***After Flushing the cache***