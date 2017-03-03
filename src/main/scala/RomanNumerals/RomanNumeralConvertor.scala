package RomanNumerals

/**
 * Created by andrew on 03/03/17.
 */
object RomanNumeralConvertor {

  def ArabicToRoman(arabic: Int) :String = {
    arabic match {
      case 0 =>{"nulla"}
      case 1 =>{"I"}
      case 2 => {"II"}
    }
  }

}
