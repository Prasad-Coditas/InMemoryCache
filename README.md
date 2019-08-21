# In Memory Cache

<b>LRU Cache Implementation Using Java LinkedHashMap</b>

LRU cache stand for Least Recently Used Cache. which evict least recently used entry. As Cache purpose is to provide fast and efficient way of retrieving data. it need to meet certain requirement.
Some of the Requirement are
Fixed Size: Cache needs to have some bounds to limit memory usages.
Fast Access: Cache Insert and lookup operation should be fast , preferably O(1) time.
Replacement of Entry in case , Memory Limit is reached: A cache should have efficient algorithm to evict the entry when memory is full.
