package RomanNumerals

import org.scalacheck.Prop._
import org.scalacheck.{Gen, Properties}

/**
 * Created by andrew on 03/03/17.
 */
class RomanNumeralConvertorPropertySpec extends Properties("my property") {

  property("no more than 3 Is together") =
    forAll(Gen.chooseNum(0, 100)) { arabic =>
      RomanNumeralConvertor.ArabicToRoman(arabic).contains("IIII") == false
    }

  property("Vs are always solitary") =
    forAll(Gen.chooseNum(0, 100)) { arabic =>
      RomanNumeralConvertor.ArabicToRoman(arabic).contains("VV") == false
    }

  property("Cannot have IIV") =
    forAll(Gen.chooseNum(0, 100)) { arabic =>
      RomanNumeralConvertor.ArabicToRoman(arabic).contains("IIV") == false
    }

  property("Cannot have VX") =
    forAll(Gen.chooseNum(0, 100)) { arabic =>
      RomanNumeralConvertor.ArabicToRoman(arabic).contains("VX") == false
    }

  property("A number greater than 0 and less than 39 has up to 3 Xs, followed by one of IV, IX, a V followed by 0-3 Is or just 1-3 Is") =
    forAll(Gen.chooseNum(1, 39)) { arabic =>
      RomanNumeralConvertor.ArabicToRoman(arabic).matches("(X){0,3}(I{1,2}|IV|V?(I){0,3}|IX)") == true
    }

  property("no more than 3 Xs together") =
    forAll(Gen.chooseNum(0, 100)) { arabic =>
      RomanNumeralConvertor.ArabicToRoman(arabic).contains("XXXX") == false
    }
}
