package sample_quiz_1

object Q2{

  // Combine a list of strings into a single with each value from the list separated be a space
  // Ex: combineSounds([])
//  def combineSounds()

  // Flattens a list of lists of sounds into a single list of sounds
  // Ex: combineSounds([], []) == []
  //AH1 N D ER0
  //P R EH1 SH ER0

  //AW1 T
  //DH AH0
  //D R EH1 S ER0
//  def combineSounds(sounds1: List[String], sounds2: List[String]: List[String] = {
//
//  }


  /**
    * Flattens a list of lists of sounds into a single list of sounds
    *
    * Ex: combineWords([["AH1", "N", "D", "ER0"],["P", "R", "EH1", "SH", "ER0"]])
    * == [["AH1", "N", "D", "ER0", "P", "R", "EH1", "SH", "ER0"]]
    * Ex: combineWords([["AW1", "T"], ["DH", "AH0"], ["D", "R", "EH1", "S", "ER0"]])
    * == [["AW1", "T", "DH", "AH0", "D", "R", "EH1", "S", "ER0"]]
    **/
  def combineWords(words: List[List[String]]): List[String] = {
    var output: List[String] = List()
    for(word <- words){
      for(sound <- word){

        output = output :+ sound
      }
    }
    output
  }

  /**
    * Returns the longest String in the input list. If there is a tie, any of the longest
    * Strings may be returned
    */
  def longestString(input: List[String]): String = {
    var longest = input.head
    for(word <- input){
      if(word.length > longest.length){
        longest = word
      }
    }
    longest
  }





  def main(args: Array[String]): Unit = {
    println(combineWords(List(List("AH1", "N", "D", "ER0"),List("P", "R", "EH1", "SH", "ER0"))))
    println(longestString(List("fw", "asdf")))
    println(longestString(List("fsdaffw", "asdf")))
    println(longestString(List()))
  }

}