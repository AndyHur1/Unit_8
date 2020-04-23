public class Hailstone {
    /**
     * Returns the length of a hailstone sequence that starts with n,
     * as described in part (a).
     * Precondition: n > 0
     */
    public static int hailstoneLength(int n) {
        /* to be implemented in part (a) */
        int times = 0;
        int Value = n;
        while (true) {
            if(Value == 1){
                times++;
                break;
            }else if (Value % 2 == 0){
                Value/= 2;
                times++;
            }else if(Value% 1 == 0){
                Value*= 3;
                Value+= 1;
                times++;
            }
        }
        return times;

    }


    /**
     * Returns true if the hailstone sequence that starts with n is considered long
     * and false otherwise, as described in part (b).
     * Precondition: n > 0
     */
    public static boolean isLongSeq(int n) {
        /* to be implemented in part (b) */

        int Output = hailstoneLength(n);

        return Output > n;

    }


    /**
     * Returns the proportion of the first n hailstone sequences that are considered long,
     * as described in part (c).
     * Precondition: n > 0
     */
    public static double propLong(int n) {
        /* to be implemented in part (c) */

        int T_num = 0;

        for (int a=1; a < n; a++)
        { if (isLongSeq(a)) {
                T_num++;
            }
        }
        return ((double)T_num/n);
    }


// There may be instance variables, constructors, and methods not shown.
}