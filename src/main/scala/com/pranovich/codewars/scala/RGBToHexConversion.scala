package com.pranovich.codewars.scala

/**
 * https://www.codewars.com/kata/513e08acc600c94f01000001/train/scala
 *
 * The rgb() method is incomplete. Complete the method so that passing in RGB decimal values
 * will result in a hexadecimal representation being returned.
 * The valid decimal values for RGB are 0 - 255. Any (r,g,b) argument values that fall out of that range
 * should be rounded to the closest valid value.
 *
 * The following are examples of expected output values:
 *
 * rgb(255, 255, 255) // FFFFFF
 * rgb(255, 255, 300) // FFFFFF
 * rgb(0, 0, 0)       // 000000
 * rgb(148, 0, 211)   // 9400D3
 */
object RGBToHexConversion {

  def rgb(r: Int, g: Int, b: Int): String = {
    def roundRGB(num: Int): Int = {
      if (num < 0) 0
      else if (num > 255) 255
      else num
    }

    Seq(r, g, b)
      .map(roundRGB)
      .map(x => f"$x%02X")
      .mkString
  }

//  def rgb(r: Int, g: Int, b: Int): String =
//    Seq(r, g, b).map(x => f"${255 min (x max 0)}%02X").mkString

}
