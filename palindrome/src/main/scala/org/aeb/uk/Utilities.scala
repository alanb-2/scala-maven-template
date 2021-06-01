package org.aeb.uk

object Utilities {

  def isPalidrome(inputString: String): Boolean = {

    def cleanInputString(inputString: String): String = {

      inputString
        .replaceAll(" ", "")
        .toLowerCase

    }

    val cleanedInputString = cleanInputString(inputString)
    val cleanedInputStringLength = cleanedInputString.length
    val cleanedInputStringHalfLength = cleanedInputStringLength % 2

    for (charIndex <- 0 to cleanedInputStringHalfLength) {
      if (cleanedInputString(charIndex) != cleanedInputString(cleanedInputStringLength - charIndex - 1)) return false
    }

    true

  }

}
