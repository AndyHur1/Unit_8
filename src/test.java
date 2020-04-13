public class test {
    public static int[][] addMatrix(int[][] list1, int[][] list2) {

        int[][] array_added = new int[list1.length][list1[0].length];

        for (int r = 0; r < list1.length; r++) {

            for (int c = 0; c < list1[0].length; c++) {

                array_added[r][c] = list1[r][c] + list2[r][c];

                System.out.println(array_added[r][c]); }

        }

        return array_added; }


    public static void main(String[] args){
        int[][] list1 = { {1, 2, 3}, {7, 13, 11}, {8, 0, 4} };
        int[][] list2 = { {10, 4, 1}, {3, 6, 2}, {5, 9, 14} };
        System.out.println(addMatrix(list1,list2));
    }
}
