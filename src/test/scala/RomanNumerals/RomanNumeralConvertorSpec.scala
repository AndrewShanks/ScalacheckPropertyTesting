package RomanNumerals

import org.scalatest._
/**
 * Created by andrew on 03/03/17.
 */
class RomanNumeralConvertorSpec extends FlatSpec with Matchers {
  "The Roman numeral convertor" should "convert 1 to I" in {
    RomanNumeralConvertor.ArabicToRoman(1) should be ("I")
  }
}
