package org.aeb.uk

import org.apache.logging.log4j.scala.Logging

object Main extends Logging {

  def main(args: Array[String]) {
    logger.info("Palindrome executing...")

    if (args.isEmpty)
      logger.error("No input arguments supplied")
    else {
      val input = args.mkString(" ")
      if (Utilities.isPalidrome(input))
        logger.info(s"'${input}' is a palindrome")
      else
        logger.info(s"'${input}' is not a palindrome")
    }

  }

}
