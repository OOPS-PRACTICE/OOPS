
public class Sample {

    public static void main(String[] args) {


        //1D Array

        int[] oneD = {10, 20, 30, 40, 50};
        System.out.println("1D Array:");
        for (int i : oneD) {
            System.out.print(i + " ");
        }
        System.out.println();

        //2D Array – Matrix of Fixed Size
        //Explanation: A two-dimensional array is like a grid or matrix. Each row has the same number of columns.
        int[][] twoD = {
                {1, 2, 3, 1},
                {4, 5, 6, 2},
                {7, 8, 9, 3}
        };
                            //0         //1
        int[][] twoD1 = { {1,2,3,1}, {4,5,6,2}};
        System.out.println("2D Array: " + twoD.length);
        System.out.println("2D Array: " + twoD1.length);
        for (int i = 0; i < twoD.length; i++) {
            System.out.println(i);
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.println(j);
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }

        //Jagged Array - Rows with Different Lengths
        int[][] jagged = new int[3][];
        jagged[0] = new int[] {1, 2};
        jagged[1] = new int[] {3, 4, 5};
        jagged[2] = new int[] {6};

        System.out.println("Jagged Array:");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

        //Explanation: A jagged array is a 2D array where
        // each row can have a different number of columns. It's great for representing uneven data
        //like seating arrangements or triangle patterns.

    }
}
