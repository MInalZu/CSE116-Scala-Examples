package tests

import datastructures.{BinarySearchTree, BinaryTreeNode}
import org.scalatest._

class TestBST extends FunSuite {

  def treesEqual[A](nodeA: BinaryTreeNode[A], nodeB: BinaryTreeNode[A]): Boolean = {
    if(nodeA == null && nodeB == null){
      true
    }else if(nodeA == null || nodeB == null){
      false
    }else if(nodeA.value != nodeB.value){
      false
    }else{
      treesEqual(nodeA.left, nodeB.left) && treesEqual(nodeA.right, nodeB.right)
    }
  }


  test("Test BST structure after inserts") {

    val intLessThan = (a: Int, b: Int) => a < b
    val bst = new BinarySearchTree[Int](intLessThan)
    bst.insert(5)
    bst.insert(2)
    bst.insert(8)
    bst.insert(4)
    bst.insert(7)
    bst.insert(14)
    bst.insert(-3)

    val root = new BinaryTreeNode[Int](5, null, null)
    root.left = new BinaryTreeNode[Int](2, null, null)
    root.right = new BinaryTreeNode[Int](8, null, null)
    root.left.left = new BinaryTreeNode[Int](-3, null, null)
    root.left.right = new BinaryTreeNode[Int](4, null, null)
    root.right.left = new BinaryTreeNode[Int](7, null, null)
    root.right.right = new BinaryTreeNode[Int](14, null, null)

    assert(treesEqual(bst.root, root))
  }

  test("Test BST find") {

    val intLessThan = (a: Int, b: Int) => a < b
    val bst = new BinarySearchTree[Int](intLessThan)
    bst.insert(5)
    bst.insert(2)
    bst.insert(8)
    bst.insert(4)
    bst.insert(7)
    bst.insert(14)
    bst.insert(-3)

    assert(bst.find(8).value == 8)
    assert(bst.find(5).value == 5)
    assert(bst.find(-3).value == -3)
    assert(bst.find(-6) == null)
    assert(bst.find(20) == null)
    assert(bst.find(6) == null)
  }

}
