# Bank Customer Queuing System
Queuing Rules:
-The bank has four type of customers, which are labelled as 0, 1, 2, 3.
-Customers with label 0 has the highest priority, then 1, 2, and, 3 have the lower priorities,
respectively.
E.g., Assume that the queue contains 0-0-0-2-3, and a new customer with label 1 joins to the
queue, the updated queue will be 0-0-0-1-2-3.
-When we consider the example above, if a customer with label 0 comes continuously, the
customer with 1, 2 and 3 labels will never be processed. To prevent this situation, you need to
use the limitations.
Limitations
-Each type of customer has limitations. A customer with label 0 can join the queue at most 5
times in a row, label 1 can join 3 times in a row, label 2 can join 2 times in a row, and label 3
can join at once in a row.
Ex: Assume the queue contains 0-0-0-0-0-1-1-1-2-3, when a customer with label 0 wants to
join, the new queue will be 0-0-0-0-0-1-1-1-2-3-0.
Ex: Assume the queue contains 0-0-0-0-0-1-1-1-2-3, when a customer with label 1 wants to
join, the new queue will be 0-0-0-0-0-1-1-1-2-3-1.
Ex: Assume the queue contains 0-0-0-0-0-1-1-1-2-3, when two customers with label 2 want
to join the queue consecutively, the new queue will be 0-0-0-0-0-1-1-1-2-2-3-2.
Processing a Customer:
While new customers are joining to the queue, the bank staff can process a customer in the
queue.
Ex: Assume the queue contains 0-0-0-0-0-1-1-1-2-3, when the bank staff finish to process
one customer, the new queue will be 0-0-0-0-1-1-1-2-3.

Note: After processing a customer in the queue like the above example, if a new customer
with label 0 joins, the new queue must look like 0-0-0-0-1-1-1-2-3-0.
Considerations:
Priorities should be considered.
Ex: Assume the queue contains 0-0-0-0-0-1-2-3, when two customers with labels 0 and 1
joins consecutively, the content updates: 0-0-0-0-0-1-2-3 -&gt; 0-0-0-0-0-1-2-3-0 -&gt; 0-0-0-0-0-
1-2-3-0-1.
Although there is one available slot for 1 between 0 and 2 as indicated above, label 0 has a
priority over label 1, so label 1 must be placed after label 0.
Note: The system must keep the names of the customers at the same time with their
priorities in the data structure.
