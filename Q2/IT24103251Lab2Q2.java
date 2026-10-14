/*
 * IT24103251
 * Lab 2 - Question 2
 * Find the radius of a circular fence made with the same rope
 */

public class IT24103251Lab2Q2
{
    public static void main(String[] args)
    {
        // given value
        double side = 10;

        // unknown values
        double rope;
        double radius;

        // PI value from the hint
        double PI = 3.14;        // if your sheet wants 22/7, write 22.0 / 7.0

        // the rope makes the square first
        // rope = perimeter of square = 4 * side
        rope = 4 * side;

        // same rope makes the circle
        // circumference = 2 * PI * radius
        // rope = 2 * PI * radius
        // radius = rope / (2 * PI)
        radius = rope / (2 * PI);

        System.out.println("Radius of the circular fence = " + radius);
    }
}