package gr.aueb.cf.review;

/**
 * Ο frog από ένα σημείο χ, φτάνει ή ξεπερνάει ένα
 * σημείο y, όπου κάθε jump έχει μήκος jmp.
 */
public class FrogJumps {

    public static void main(String[] args) {

    }

    public static int frogJumps(int start, int end, int jump) {
        int jumps = 0;

        while (start < end) {
            start += jump;
            jumps++;
        }
        return jumps;
    }

    public static int frogJumps2(int start, int end, int jump) {
       return (int) Math.ceil((double)(end - start) / jump);
    }
}
