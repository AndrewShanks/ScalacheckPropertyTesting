package RomanNumerals

import org.scalatest._
/**
 * Created by andrew on 03/03/17.
 */
class RomanNumeralConvertorSpec extends FlatSpec with Matchers {
  "The Roman numeral convertor" should "convert 1 to I" in {
    RomanNumeralConvertor.arabicToRoman(1) should be ("I")
  }

  "The Roman numeral convertor" should "convert 2 to II" in {
    RomanNumeralConvertor.arabicToRoman(2) should be ("II")
  }

  "The Roman numeral convertor" should "convert 0 to nulla" in {
    RomanNumeralConvertor.arabicToRoman(0) should be ("nulla")
  }

  "The Roman numeral convertor" should "convert 3 to III" in {
    RomanNumeralConvertor.arabicToRoman(3) should be ("III")
  }

  "The Roman numeral convertor" should "convert 4 to IV" in {
    RomanNumeralConvertor.arabicToRoman(4) should be ("IV")
  }

  "The Roman numeral convertor" should "convert 5 to V" in {
    RomanNumeralConvertor.arabicToRoman(5) should be ("V")
  }

  "The Roman numeral convertor" should "convert 6 to VI" in {
    RomanNumeralConvertor.arabicToRoman(6) should be ("VI")
  }

  "The Roman numeral convertor" should "convert 7 to VII" in {
    RomanNumeralConvertor.arabicToRoman(7) should be ("VII")
  }

  "The Roman numeral convertor" should "convert 9 to IX" in {
    RomanNumeralConvertor.arabicToRoman(9) should be ("IX")
  }

  "The Roman numeral convertor" should "convert 10 to X" in {
    RomanNumeralConvertor.arabicToRoman(10) should be ("X")
  }

  "The Roman numeral convertor" should "convert 11 to XI" in {
    RomanNumeralConvertor.arabicToRoman(11) should be ("XI")
  }

  "The Roman numeral convertor" should "convert 12 to XII" in {
    RomanNumeralConvertor.arabicToRoman(12) should be ("XII")
  }

  "The Roman numeral convertor" should "convert 14 to XIV" in{
    RomanNumeralConvertor.arabicToRoman(14) should be ("XIV")
  }

  "The Roman numeral convertor" should "convert 20 to XX" in{
    RomanNumeralConvertor.arabicToRoman(20) should be ("XX")
  }

  "The Roman numeral convertor" should "convert 30 to XXX" in{
    RomanNumeralConvertor.arabicToRoman(30) should be ("XXX")
  }

  "The Roman numeral convertor" should "convert 62 to LXII" in{
    RomanNumeralConvertor.arabicToRoman(62) should be ("LXII")
  }

  "The Roman numeral convertor" should "convert 99 to XCIX" in{
    RomanNumeralConvertor.arabicToRoman(99) should be ("XCIX")
  }

  "The Roman numeral convertor" should "convert 46 to XLVI" in {
    RomanNumeralConvertor.arabicToRoman(46) should be ("XLVI")
  }

  "The Roman numeral convertor" should "convert 100 to C" in {
    RomanNumeralConvertor.arabicToRoman(100) should be ("C")
  }

  "The Roman numeral convertor" should "convert 520 to DXX" in {
    RomanNumeralConvertor.arabicToRoman(520) should be ("DXX")
  }

  "The Roman numeral convertor" should "convert 972 to CMLXXII" in {
    RomanNumeralConvertor.arabicToRoman(972) should be ("CMLXXII")
  }

  "The Roman numeral convertor" should "convert 1000 to M" in {
    RomanNumeralConvertor.arabicToRoman(1000) should be ("M")
  }

  "The Roman numeral convertor" should "convert I to 1" in  {
    RomanNumeralConvertor.romanToArabic("I") should be (1)
  }

  "The Roman numeral convertor" should "convert II to 2" in  {
    RomanNumeralConvertor.romanToArabic("II") should be (2)
  }
  "The Roman numeral convertor" should "convert V to 5" in  {
    RomanNumeralConvertor.romanToArabic("V") should be (5)
  }
  "The Roman numeral convertor" should "convert XVI to 16" in  {
    RomanNumeralConvertor.romanToArabic("XVI") should be (16)
  }
  "The Roman numeral convertor" should "convert MDCL to 1650" in  {
    RomanNumeralConvertor.romanToArabic("MDCL") should be (1650)
  }
  "The Roman numeral convertor" should "convert IV to 4" in  {
    RomanNumeralConvertor.romanToArabic("IV") should be (4)
  }
  "The Roman numeral convertor" should "convert IX to 9" in  {
    RomanNumeralConvertor.romanToArabic("IX") should be (9)
  }
  "The Roman numeral convertor" should "convert XXIV to 24" in  {
    RomanNumeralConvertor.romanToArabic("XXIV") should be (24)
  }
  "The Roman numeral convertor" should "convert CDXLIV to 444" in  {
    RomanNumeralConvertor.romanToArabic("CDXLIV") should be (444)
  }
  "The Roman numeral convertor" should "convert CMXCIX to 999" in  {
    RomanNumeralConvertor.romanToArabic("CMXCIX") should be (999)
  }




}
