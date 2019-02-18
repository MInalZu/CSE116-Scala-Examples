package sample_quiz_1

object Q1 {

  def computeOnList(input: List[Int]): Int = {
    var result = 0
    for(value <- input){
      result += computeOnInt(value)
    }
    result
  }

  def computeOnInt(input: Int): Int = {
    if(input > 10){
      input - 3
    }else{
      input * 2
    }
  }

  def main(args: Array[String]): Unit = {
    val numbers: List[Int] = List(4,12,7)
    val result: Int = computeOnList(numbers)
    println(result)
  }

}
