# Data Structures

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
2. Good locality of reference and data cache utilization
3. Easy to insert/delete at the end

Disadvantages: 

1. Wastes more memory due to capacity size
2. Shifting elements is time-consuming O(n)
3. Expanding the array is time-consuming O(n)

---

A **Set** is a collection that cannot contain duplicate elements. 

Set guarantees there are no duplicate object present. List don't, you can have multiple entries of "equal" objects in a list. There are millions of things that you can use set and it will make your life much easier, for example, a set of countries, a set of username, etc. If you use a list to store these data, you will need to check whether your list has already contained the same element or not before adding the new one unless the list is allowed to have duplicates.


    There can be  HashTables, HashMaps, TreeSets, LinkedHashSet, SortedSet, Abstract Set


---

**Graph** is used to model a network

Undirected Graph - Can be linked to multiple nodes | Example - Facebook - Mutual Friends

Directed Graph - Can only link one node to another (one way connection) | Example - Google Maps

N -> N -> N
|
v
N-> N
|
v 
N

--- 

**Tree** is a non-linear data structure where nodes are organized in a heirachy

1. Start nodes are called root 
2. Middle nodes are called branch 
3. End nodes are called leaf 

1. Size of a tree = # of Nodes
2. Depth of a tree = # of edges below root node to the desired leaf node
3. Height of a tree = # of edges above further leaf node



# Algorithms

**Big O Notation**

Calculates the efficiency and space of an algorithm.

"How code slows down, as data grows."

1. It describes the performance of an algorithm as the amount of data increases.
2. Machine independent (number of steps to completion)
3. Ignores its smaller operation - O(n) proceeds O(1), so if the algorithm's efficiency is O(n) and also has O(1) it is O(n)

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
3. Searching through a linked-list

O(n log n) 
1. Quasilinear time
2. Quick sort 
3. Merge sort
4. Heap sort

O(n^2)
1. Quadratic time
2. Insertion sort
3. Select sort
4. Bubble sort

O(N!)
1. Factorial time

---
**Adjacency matrix** - Quick to look up an edge in a graph, but it uses a lot of room | Time Complexity = O(1), Space Complexity = O(N^2)

**Adjacency list** - Each list is a linked list, finds adjancey between nodes | Time Complexity = O(N), Space Complexity = O(N + N)

**Depth First Search (DFS)** is a search algorithm used for transversing a tree or graph data structure a branch at a time.

1. Pick a route
2. Keep going until you reach a dead end, or a previously visited node.
3. Backtrack to last node that has unvisited adjacent neighbours
4. Utilizes a stack

**Breadth First Search (BFS)** is a search algorithm for transversing a tree or graph data structure one level at a time.

1. Pick a starting route
2. Which adjacent neighbours are connecting to that node
3. And so forth for each node (level)
4. Utilizes a queue

**Binary Tree**  where each node cannot have more than 2 (0 & 1) children

1. Root node should be larger than left child node but smaller than right child node

**Binary Search Tree** where each node cannot have more than 2 (0 & 1) children

1. Each node going to the left has the least value and each node going to the right has the most

Applications of binary trees
1. Binary Search Tree - Used in many search applications where data is constantly entering/leaving, such as the map and set objects in many languages' libraries.


2. Binary Space Partition - Used in almost every 3D video game to determine what objects need to be rendered.


3. Binary Tries - Used in almost every high-bandwidth router for storing router-tables.


4. Hash Trees - Used in torrents and specialized image-signatures in which a hash needs to be verified, but the whole file is not available. Also used in blockchains for eg. Bitcoin.


5. Heaps - Used in implementing efficient priority-queues, which in turn are used for scheduling processes in many operating systems, Quality-of-Service in routers, and A* (path-finding algorithm used in AI applications, including robotics and video games). Also used in heap-sort.


6. Huffman Coding Tree (Chip Uni) - Used in compression algorithms, such as those used by the .jpeg and .mp3 file-formats.


7. GGM Trees - Used in cryptographic applications to generate a tree of pseudo-random numbers.


8. Syntax Tree - Constructed by compilers and (implicitly) calculators to parse expressions.


9. Treap - Randomized data structure used in wireless networking and memory allocation.


10. T-tree - Though most databases use some form of B-tree to store data on the drive, databases which keep all (most) their data in memory often use T-trees to do so.




 # By James

