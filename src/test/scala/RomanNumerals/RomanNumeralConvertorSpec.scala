package RomanNumerals

import org.scalatest._
/**
 * Created by andrew on 03/03/17.
 */
class RomanNumeralConvertorSpec extends FlatSpec with Matchers {
  "The Roman numeral convertor" should "convert 1 to I" in {
    RomanNumeralConvertor.ArabicToRoman(1) should be ("I")
  }

  "The Roman numeral convertor" should "convert 2 to II" in {
    RomanNumeralConvertor.ArabicToRoman(2) should be ("II")
  }

  "The Roman numeral convertor" should "convert 0 to nulla" in {
    RomanNumeralConvertor.ArabicToRoman(0) should be ("nulla")
  }

}
