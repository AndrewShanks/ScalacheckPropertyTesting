package RomanNumerals

/**
 * Created by andrew on 03/03/17.
 */
object RomanNumeralConvertor {
  val romanOne = "I"
  val romanFive = "V"
  val romanTen = "X"
  val romanZero = "nulla"
  def ArabicToRoman(arabic: Int) :String = {
    arabic match {
      case 0 =>{romanZero}
      case n:Int if (n>0  && n< 4) => {
        romanOne * n
      }
      case 4 =>{romanOne + romanFive}
      case 5 =>{romanFive}
      case n:Int if (n>5 && n < 9)=>{
        romanFive + (romanOne * (n-5))
      }
      case 9 => {romanOne + romanTen}
      case 10 => {romanTen}
      case n:Int if (n > 10 ) => {romanTen + (romanOne * (n-10))}

    }
  }

}
