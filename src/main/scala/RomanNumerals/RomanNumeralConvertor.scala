package RomanNumerals

/**
 * Created by andrew on 03/03/17.
 */
object RomanNumeralConvertor {
  val romanOne: Char = 'I'
  val romanFive: Char  = 'V'
  val romanTen: Char = 'X'
  val romanZero = "nulla"
  val romanFifty: Char = 'L'
  val romanHundred: Char = 'C'
  val romanFiveHundred: Char = 'D'
  val romanThousand: Char = 'M'

  val twoCharacterMappings = List("IV" -> 4, "IX" -> 9, "XL" -> 40, "XC"->90, "CD" -> 400, "CM" -> 900)

  def arabicToRoman(arabic: Int) :String = {
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

  private def digitToRoman(digit:Long, romanDigit:Char, fiveTimes:Char, tenTimes:Char ):String = {
    digit match {
      case 0 =>{""}
      case n:Long if (n>0  && n< 4) => {
        combineSymbols(romanDigit,n)
      }
      case 4 =>{romanDigit.toString + fiveTimes.toString}
      case 5 =>{fiveTimes.toString}
      case n:Long if (n>5 && n < 9)=>{
        fiveTimes + combineSymbols(romanDigit, (n-5))
      }
      case 9 => {romanDigit.toString + tenTimes.toString}
    }
  }

  private def highestDigits(arabic:Int, highestPlace:Int, highestRoman:Char) = {
    combineSymbols(highestRoman,arabic/(Math.round(Math.pow(10,highestPlace))))
  }

  def romanToArabic(roman: String):Int = {
    def go (total: Int, roman: String):Int = {
      if (roman.length == 0){
       total
      } else {
        val sequence = extractRelevantSequence(roman)
        go(total+getSequenceValue(sequence), roman.substring(sequence.length))
      }
    }
    return go(0,roman)
  }

  private def extractRelevantSequence(roman:String):String = {
    twoCharacterMappings.foldLeft(roman.charAt(0).toString)(
      (sequence, mapping)=> if(roman.startsWith(mapping._1)) {mapping._1} else {sequence}
    )
  }

  private def getSequenceValue(sequence: String) = {
    if(sequence.length == 1){
      getRomanDigitValue(sequence.charAt(0))
    } else {
      twoCharacterMappings.foldLeft(0)((total, mapping) => if(mapping._1 == sequence) {mapping._2} else {total})
    }
  }


  private def combineSymbols(symbol:Char,times:Long)= {
    var i:Long = times
    val stringBuilder = new StringBuilder
    while (i > 0){
      stringBuilder.append(symbol)
      i = i - 1
    }
    stringBuilder.toString()
  }

  private def getRomanDigitValue(digit:Char) :Int = {
    digit match {
      case `romanOne` => 1
      case `romanFive` => 5
      case `romanTen` => 10
      case `romanFifty` => 50
      case `romanHundred` => 100
      case `romanFiveHundred` => 500
      case `romanThousand` => 1000
     }
  }
}
