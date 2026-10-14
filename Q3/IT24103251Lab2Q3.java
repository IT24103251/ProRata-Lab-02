/*
 * IT24103251
 * Lab 2 - Question 3
 * Find the hypotenuse of a right triangle
 */

public class IT24103251Lab2Q3
{
    public static void main(String[] args)
    {
        // given values
        double sideA = 3;
        double sideB = 4;

        // unknown value
        double hypotenuse;

        // hypotenuse = square root of (sideA^2 + sideB^2)
        hypotenuse = Math.sqrt(sideA * sideA + sideB * sideB);

        System.out.println("Hypotenuse of the triangle = " + hypotenuse);
    }
}