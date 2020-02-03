package com.knoldus


class VowelCount {
  def vowelCount(string: String): Int = {
    val length = string.length
    val array = new Array[Int](length)
    for (counter <- 0 until length) {
      if (counter == 0) {
        array(counter) = length
      }
      else {
        array(counter) = (length - counter) + array(counter - 1) - counter
      }
    }

    val sum: Array[Int] = new Array[Int](1)
    sum(0) = 0
    for (i <- 0 until length) {
      val ch = string.charAt(i)
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') sum(0) += array(i)
    }
    sum(0)
  }

}


object VowelCount extends App {
  val countVowel = new VowelCount()
  val string = scala.io.StdIn.readLine(" Enter the string : ")
  val stringLower: String = string.toLowerCase
  println(countVowel.vowelCount(stringLower))
}
