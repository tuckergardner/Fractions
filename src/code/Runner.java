package code;

public class Runner
{
public static void main(String[] args)
{
 Fraction myFraction = new Fraction(2,3);
 Fraction otherFraction = new Fraction (5);
 Fraction a = myFraction;
 System.out.println(myFraction);
 System.out.println(a.equals(myFraction));
 Fraction multiplied = myFraction.multiply(otherFraction);
 System.out.println(multiplied);

}
}
