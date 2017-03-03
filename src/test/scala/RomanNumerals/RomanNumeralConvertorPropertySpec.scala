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

  property("Cannot have IIV") =
    forAll(Gen.chooseNum(0, 100)) { arabic =>
      RomanNumeralConvertor.ArabicToRoman(arabic).contains("IIV") == false
    }

//  property("A number greater than 0 and less than 40 has up to 3 Xs, followed by either IV or a V with up to 3 Is") =
//    forAll(Gen.chooseNum(1, 39)) { arabic =>
//      RomanNumeralConvertor.ArabicToRoman(arabic).matches("(X){0,3}(IV|V(I){0,3})") == false
//    }
}
