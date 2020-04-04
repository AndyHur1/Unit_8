public class ThreeByThree<list> {
    public static void main(String[] args) {
//2D array size 3x3

        double[][] list = new double[3][3];

        System.out.println(list[0][0]);
        System.out.println(list[0][1]);
        System.out.println(list[0][2]);
        System.out.println(list[1][0]);
        System.out.println(list[1][1]);
        System.out.println(list[1][2]);
        System.out.println(list[2][0]);
        System.out.println(list[2][1]);
        System.out.println(list[2][2]);

        list[0][0] = 1;
        list[0][1] = 2;
        list[0][2] = 3;
        list[1][0] = 4;
        list[1][1] = 5;

        list[1][2] = -1;
        list[2][0] = -2;
        list[2][1] = -3;
        list[2][2] = -4;

        System.out.println("");

        System.out.println(list[0][1]);
        System.out.println(list[0][2]);
        System.out.println(list[1][0]);
        System.out.println(list[1][1]);
        System.out.println(list[1][2]);
        System.out.println(list[2][0]);
        System.out.println(list[2][1]);
        System.out.println(list[2][2]);
    }
}
