/*
 * IT12345678
 * Lab 2 - Question 1
 * Find the length and width of a rectangular fence
 */

public class IT24103251Lab2Q1
{
    public static void main(String[] args)
    {
        // given value
        double perimeter = 100;

        // unknown values
        double length;
        double width;

        // perimeter = 2 * (length + width)
        // width = 3/4 of length  ->  width = 0.75 * length
        //
        // 100 = 2 * (length + 0.75 * length)
        // 100 = 3.5 * length
        // so  length = 100 / 3.5
        length = perimeter / 3.5;

        // width is 3/4 of the length
        width = 0.75 * length;

        System.out.println("Length of the fence = " + length);
        System.out.println("Width of the fence = " + width);
    }
}