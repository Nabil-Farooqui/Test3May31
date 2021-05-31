class ExceptionEx
{
 public static void main(String args[]) 
 {
  int number1 = 0;
  int number2 = 60;
  try 
  {
   int result = number2 / number1;      //division by 0 will give error
   System.out.println("division");
  } 
  catch (ArithmeticException error)       //the number is divided by 0 instead of error it'll avoid because of 
  {
   System.out.println("the exception catches it and the error is = " + error);     //division with 0
  }
  System.out.println("Terminate");    //jumps to terminate
 }
}
