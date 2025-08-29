

public class ArraysPractice {

    public static void main(String[] args){

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        //System.out.println(args[3]);



        //Declare and Initialize

        int a = 10;
        int b = 2;
        int c = 3;

        //Collection of similar kind of data

        //Integer type of array
        int[] array = {1,2,3};



        int[] ar = {1,2,3,4,5};

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;

        char[] arr1 = new char[5];
        System.out.println("In Char Array   " + arr1);
        System.out.println("In Array   " + arr[0]);
        System.out.println("In Array   " + arr);

        //data type and variable name

        //Allocate memory for array in heap and starting address in stack
        int[] intArray = new int[10];
       int a1 = intArray.length;
       System.out.println(intArray.length);

        //Allocate memory in stack
        int d = 0;

        //Traversing an array

       /* for(int i=0;i <= ar.length-1;i++){

        }*/

        for(int k : arr){
          System.out.println("In a for loop" + k);
        }

        //2D / Matrix

        /*int [][] arr =  new int[3][4];
        int [][] arrys = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };*/

        char arrChar[][] = new char[3][2];
        arrChar[0][0] = 1;
        arrChar[0][1] = 1;
        //arrChar[0][2] = 1;


        //Jagged Array : Array of Arrays of different length
        char[][] arryas = new char[2][];
        arryas[0] = new char[1];
        arryas[1] = new char[2];
        arryas[0][0] = 'a';
        arryas[1][0] = 'b';
        arryas[1][1] = 'c';
        System.out.println(arryas[0][0]);


        Animal[] an = new Animal[5];

        //Drawbacks of Array
        // Fixed Size
        //Insufficient Insertions and Deletions
        //Memory Wastage
        //Homogeneous Elements only



    }
}

