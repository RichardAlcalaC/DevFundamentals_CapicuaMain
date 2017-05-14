
/**
 * Write a description of class Main here.
 *
 * @author  Richard Alcala C
 * @version 0.1
 */
public class Main
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    public static boolean numberIsCapicua(int number)
    {
        System.out.printf("%d <= %d\n", number, reverse(number));
        return number == reverse(number);
    }
    
    private static int reverse(int number)
    {   
        int reverseNumber = 0;
        while(number>0){
            reverseNumber = reverseNumber*10+number%10;
            number /= 10;
        }
        return reverseNumber;
    }
    
    
}
