package RomanNumerals

/**
 * Created by andrew on 03/03/17.
 */
object RomanNumeralConvertor {
  val romanOne = "I"
  val romanFive = "V"
  val romanTen = "X"
  val romanZero = "nulla"
  val romanFifty = "L"
  val romanHundred = "C"
  def ArabicToRoman(arabic: Int) :String = {
    arabic match {
      case 0 =>{romanZero}
      case n :Int if (n>0 )  => {
        tensToRoman(tensDigit(n)) + unitsToRoman(unitsValue(n))
      }
    }
  }

  private def unitsValue(arabic: Int):Int = {
    arabic % 10
  }

  private def tensDigit(arabic:Int):Int = {
    (arabic /10) % 10
  }

  private def unitsToRoman(unitsDigit:Int):String = {
    digitToRoman(unitsDigit, romanOne, romanFive, romanTen)
  }

  private def tensToRoman(tensDigit:Int):String = {
    digitToRoman(tensDigit, romanTen, romanFifty, romanHundred)
  }

  private def digitToRoman(digit:Int, romanDigit:String, fiveTimes:String, tenTimes:String ) = {
    digit match {
      case 0 =>{""}
      case n:Int if (n>0  && n< 4) => {
        romanDigit * n
      }
      case 4 =>{romanDigit + fiveTimes}
      case 5 =>{fiveTimes}
      case n:Int if (n>5 && n < 9)=>{
        fiveTimes + (romanDigit * (n-5))
      }
      case 9 => {romanDigit + tenTimes}
    }

  }

}
