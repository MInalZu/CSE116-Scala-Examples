package sample_quiz_1

object Q4 {

  def computeOnMap(input: Map[String, Int]): Int = {
    val cutoff: Int = 6
    var result: Int = -1
    for((key, value) <- input){
      if(value > cutoff){
        result = computeOnString(key)
      }
    }
    result
  }

  def computeOnString(input: String): Int = {
    val result: Int = input.length
    result
  }

  def main(args: Array[String]): Unit = {
    val mapping: Map[String, Int] = Map("seven" -> 7, "one" -> 1, "six" -> 6)
    val result: Int = computeOnMap(mapping)
    println(result)
  }

}
