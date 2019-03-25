package datastructures

object LinkedListExample {

  def main(args: Array[String]): Unit = {

    // create the list [5, 3, 1] starting at the end and prepending each value
    var myList: LinkedListNode[Int] = new LinkedListNode[Int](1, null)
    myList = new LinkedListNode[Int](3, myList)
    myList = new LinkedListNode[Int](5, myList)

    // prints 1
    println(myList.next.next.value)
  }

}
