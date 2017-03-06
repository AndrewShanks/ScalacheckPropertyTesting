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
  val romanFiveHundred = "D"
  val romanThousand = "M"
  def ArabicToRoman(arabic: Int) :String = {
    arabic match {
      case 0 =>{romanZero}
      case n :Int if (n>0 )  => {
        highestDigits(n,3,romanThousand) + hundredsToRoman(hundredsDigit(n)) + tensToRoman(tensDigit(n)) + unitsToRoman(unitsValue(n))
      }
    }
  }

  private def unitsValue(arabic: Int) = {
    arabic % 10
  }

  private def tensDigit(arabic:Int) = {
    extractDigit(arabic, 1)
  }

  private def hundredsDigit(arabic:Int) = {
    extractDigit(arabic, 2)
  }

  private def unitsToRoman(unitsDigit:Long):String = {
    digitToRoman(unitsDigit, romanOne, romanFive, romanTen)
  }

  private def tensToRoman(tensDigit:Long):String = {
    digitToRoman(tensDigit, romanTen, romanFifty, romanHundred)
  }

  private def hundredsToRoman(hundredsDigit: Long):String = {
    digitToRoman(hundredsDigit, romanHundred, romanFiveHundred, romanThousand)
  }

  private def extractDigit(value:Int, place:Int) = {
    val quotient:Long =  Math.round(Math.pow(10,place))
    val intermediary:Long = value/quotient
    val digit = intermediary % 10
    digit
  }

  private def digitToRoman(digit:Long, romanDigit:String, fiveTimes:String, tenTimes:String ) = {
    digit match {
      case 0 =>{""}
      case n:Long if (n>0  && n< 4) => {
        combineSymbols(romanDigit,n)
      }
      case 4 =>{romanDigit + fiveTimes}
      case 5 =>{fiveTimes}
      case n:Long if (n>5 && n < 9)=>{
        fiveTimes + combineSymbols(romanDigit, (n-5))
      }
      case 9 => {romanDigit + tenTimes}
    }
  }

  private def highestDigits(arabic:Int, highestPlace:Int, highestRoman:String) = {
    combineSymbols(highestRoman,arabic/(Math.round(Math.pow(10,highestPlace))))

  }

  private def combineSymbols(symbol:String,times:Long)= {
    var i:Long = times
    val stringBuilder = new StringBuilder
    while (i > 0){
      stringBuilder.append(symbol)
      i = i - 1
    }
    stringBuilder.toString()
  }

}
