import TreeAssignment.{height, maximumHeight, name, printTree, symbol}

import scala.io.StdIn.readLine

object TreeAssignment extends  App {

  //TODO ask person's name
  //TODO ask for tree height
  //TODO print a xmas tree (or another tree) by calling printTree function with the correct parameters
  //tree height should be the one assigned
  //simple version for height 3 would be
  //  *
  // ***
  //*****

  //for full points I would like to see the following
  //if user enters name Valdis  and height 9
  //then we should print
  //        *
  //       VVV
  //      AAAAA
  //     LLLLLLL
  //    DDDDDDDDD
  //   IIIIIIIIIII
  //  SSSSSSSSSSSSS
  // VVVVVVVVVVVVVVV
  //AAAAAAAAAAAAAAAAA
  // println(" "*10+"*"*5)
  //let's consider maximum height 40 (so person's name letters could repeat many times)

  val name = readLine("Hello! What is your name?")
  val height = readLine("Enter you trees height:").toInt
  val symbol = '*'
  val maximumHeight:Int = 40

  def printTree(name: String, height: Int, symbol: Char = '*', maximumHeight: Int = 40): Unit = {

    val name1 = name + name * (height / name.length)
    if (height > maximumHeight)
     println("It is too high!")
     else {
     println(" " * (height - 1) + s"$symbol")
      for (i <- 2 to height) {
        val a = name1(i - 2).toString.toUpperCase
        println(" " * (height - i) + a * (i * 2 - 1))}
      }
  }
  printTree(name, height, symbol, maximumHeight)
}