package org.aeb.uk

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class PalindromeTest extends AnyFlatSpec with should.Matchers {

  behavior of "Text utilities"

  it should "detect a palindrome for a word with an even number of characters" in {

    val palindrome = "deed"

    Utilities.isPalidrome( palindrome ) should be (true)

  }

  it should "detect a palindrome for a word with an odd number of characters" in {

    val palindrome = "racecar"

    Utilities.isPalidrome( palindrome ) should be (true)

  }

  it should "fail to detect a palindrome for a single word that is not a palindrome" in {

    val notAPalindrome = "flag"

    Utilities.isPalidrome( notAPalindrome ) should be (false)

  }

  it should "fail to detect a palindrome for multiple words that are not a palindrome" in {

    val notAPalindrome = "this is not a palindrome"

    Utilities.isPalidrome( notAPalindrome ) should be (false)

  }

  it should "detect a palindrome for a multi-word palindrome" in {

    val palindrome = "a man a plan panama"

    Utilities.isPalidrome( palindrome ) should be (true)

  }



}
