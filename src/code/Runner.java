package code;

public class Runner
{
public static void main(String[] args)
{
 Fraction myFraction = new Fraction(2,0);
 Fraction otherFraction = new Fraction (5);
 Fraction a = myFraction;
 System.out.println(myFraction);
 System.out.println(a.equals(myFraction));
 Fraction multiplied = myFraction.multiply(otherFraction);
 System.out.println(multiplied);

}
 {
  Fraction f1 = null;
  try
 {
   f1 = new Fraction(3,0);
 }
 catch (Exception e)
 {
  System.out.println("fractions need a non 0 denominator");
 }

 }
 Fraction  thatFraction = new Fraction(12, 4);
//System.out.println(thatFraction);

}
