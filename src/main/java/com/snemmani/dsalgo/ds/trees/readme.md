# Tree Data Structure
Tree represents the nodes connected by edges.

**Inspiration [Tutorials Point: Trees](https://www.tutorialspoint.com/data_structures_algorithms/tree_data_structure.htm)** 

## Binary Tree or Binary Search Tree
Binary Tree is a special datastructure used for data storage purposes. A binary tree has a special condition that each node can have a maximum of two children. A binary tree has the benefits of both an ordered array and a linked list as search is as quick as in a sorted array and insertion or deletion operation are as fast as in linked list.
![img](https://www.tutorialspoint.com/data_structures_algorithms/images/binary_tree.jpg)

### Implementation
Binary Tree is implemented [here](./BinaryTree.java)

### Disadvantages
What if the input to binary search tree comes in a sorted (ascending or descending) manner? It will then look like this −
![sorted input](https://www.tutorialspoint.com/data_structures_algorithms/images/unbalanced_bst.jpg)
It is observed that BST's worst-case performance is closest to linear search algorithms, that is Ο(n). 
In real-time data, we cannot predict data pattern and their frequencies. So, a need arises to balance out the existing BST.

## AVL Tree
Named after their inventor Adelson, Velski & Landis, AVL trees are height balancing binary search tree. AVL tree checks the height of the left and the right sub-trees and assures that the difference is not more than 1. This difference is called the Balance Factor.
![avl tree](https://www.tutorialspoint.com/data_structures_algorithms/images/unbalanced_avl_trees.jpg)

> `BalanceFactor = height(left-sutree) − height(right-sutree)`

### AVL Rotations
To balance itself, an AVL tree may perform the following four kinds of rotations −

 * Left rotation
 * Right rotation
 * Left-Right rotation
 * Right-Left rotation

The first two rotations are single rotations and the next two rotations are double rotations. To have an unbalanced tree, we at least need a tree of height 2. With this simple tree, let's understand them one by one.

#### Left rotation
If a tree becomes unbalanced, when a node is inserted into the right subtree of the right subtree, then we perform a single left rotation −
![left rotation](https://www.tutorialspoint.com/data_structures_algorithms/images/avl_left_rotation.jpg)

#### Right rotation
If a tree becomes unbalanced, when a node is inserted into the left subtree of the left subtree, then we perform a single right rotation −
![right rotation](https://www.tutorialspoint.com/data_structures_algorithms/images/avl_right_rotation.jpg)

#### Left Right Rotation
If a tree becomes unbalanced, when a node is inserted into the right subtree of the left subtree, then we perform a left right rotation.

#### Right Left Rotation
If a tree becomes unbalanced, when a node is inserted into the left subtree of the right subtree, then we perform a right left rotation.
