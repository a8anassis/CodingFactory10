package gr.aueb.cf.ch2;

/**
 * Typecast demo
 */
public class TypecastApp4 {

    public static void main(String[] args) {
        int myInt = Integer.MAX_VALUE;
        long myLong = 20L;        // type suffix

       // myInt = (int) myLong;  // Typecast is Error prone
        myInt = myInt + 10;           // Overflow

        System.out.println(myInt);
    }
}
