# DSA.Data Structures
This is a repository containing data structures and algorithms.

---------------

Use a _**queue**_ when you want to get things out in the order that you put them in.

Queue's useful where? **First in First out**

1. Keyboard buffers (letters should appear on the screen in the order they're pressed).

2. Printer queue's (print job should be completed in that order)
3. Used in Linked-Lists, PriorityQueues and Breadth-first search.

A **Priorityque** is the same as a normal que except it orders ascendingly.

-------------

Use a **_stack_** when you want to get things out in the reverse order than you put them in.

Stack useful where? **Last in First out**

1. Reversing a string

2. Browser use stack data structure to keep track of last visited sites.

3. Recursion

---

Use a **_list_** when you want to get anything out, regardless of when you put them in (and when you don't want them to automatically be removed).

List's useful where?

1. For recording a large amount of data
2. To store and collect a large amount of data
3. Multiple types of lists such as Arraylist, Linkedlist, etc.

---

**Linked List** - Address is linked to the next node. There are two types: **singley & doubly** linked list where doubly consists of an address for the head and tail of the value.

1. Dynamic data structure - allocates needed memory whilst running
2. Insertion and deletion of nodes are easy (O(1)).
3. No/low memory waste

Problem is that there is no indexing so O is O(N);

LinkedList's useful where?

1. GPS nagivation
2. music playlist
3. implements stacks and queue's


    Singly Linked List - [data | address] - > [data | address] - > [data | address] 

    Doubly Linked List - [address | data | address] <-> [address | data | address] <-> [a..

---

A **Dynamic Array** is initialized by Arraylist

Advantages:

1. Random access of elements - O(1)
2. Good locality of refrence and data cache utilization
3. Easy to insert/delete at the end

Disadvantages: 

1. Wastes more memory due to capacity size
2. Shifting elements is time consuming O(n)
3. Expanding the array is time consuming O(n)

---

#Big O Notation

Calculates the efficiency and space of an algorithm.

"How code slows as dat grows."

1. It describes the performance of an algorithm as the amount of data increases.
2. Machine independant (number of steps to completion)
3. Ignores it's smaller operation - O(n) preceeds O(1), so if the algorithm's effiency is O(n) and also has O(1) it is O(n)

---

O(1) 
1. Constant time
2. Random access of an element in an array
3. Inserting at the beginning of linked list

O(log n) 
1. Logarithmic time
2. Binary search

O(n) 
1. Linear time
2. Looping through elements in an array
3. Searching through a linkedlist

O(n log n) 
1. Quasilinear time
2. Quick sort 
3. Merge sort
4. Heap sort

O(n^2)
1. Quadratic time
2. Insertion sort
3. Selectin ort
4. Bubble sort

O(N!)
1. Factorial time


 # By James

