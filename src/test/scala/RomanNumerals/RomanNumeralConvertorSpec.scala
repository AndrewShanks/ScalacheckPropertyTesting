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

  "The Roman numeral convertor" should "convert 3 to III" in {
    RomanNumeralConvertor.ArabicToRoman(3) should be ("III")
  }

  "The Roman numeral convertor" should "convert 4 to IV" in {
    RomanNumeralConvertor.ArabicToRoman(4) should be ("IV")
  }

  "The Roman numeral convertor" should "convert 5 to V" in {
    RomanNumeralConvertor.ArabicToRoman(5) should be ("V")
  }

  "The Roman numeral convertor" should "convert 6 to VI" in {
    RomanNumeralConvertor.ArabicToRoman(6) should be ("VI")
  }

  "The Roman numeral convertor" should "convert 7 to VII" in {
    RomanNumeralConvertor.ArabicToRoman(7) should be ("VII")
  }

  "The Roman numeral convertor" should "convert 9 to IX" in {
    RomanNumeralConvertor.ArabicToRoman(9) should be ("IX")
  }

  "The Roman numeral convertor" should "convert 10 to IX" in {
    RomanNumeralConvertor.ArabicToRoman(10) should be ("X")
  }


}
