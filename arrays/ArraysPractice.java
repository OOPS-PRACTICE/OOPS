

public class ArraysPractice {

    public static void main(String[] args){

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        //System.out.println(args[3]);



        //Declare and Initialize

        int firstTemp = 10;
        int secondTemp = 2;
        int thirdTemp = 3;

        //Collection of similar kind of data

        //Integer type of array
        int[] intArray = {1,2,3};

        //arr[2], arr[3], arr[4] is having a default int value as we have not intialized it
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;

        char[] firstArr = new char[5];
        System.out.println("In Char Array   " + firstArr);
        System.out.println("In Array   " + arr[0]);
        System.out.println("In Array   " + arr);

        //data type and variable name

        //Allocate memory for array in heap and
        // starting address in stack
        int[] firstIntArray = new int[10];
       int intArrayLength = intArray.length;
       System.out.println(intArrayLength);

        //Allocate memory in stack
        int fourTemp = 0;

        //Traversing an array

       /* for(int i=0;i <= ar.length-1;i++){

        }*/

        for(int fifthTemp : arr){
          System.out.println("In a for loop" + fifthTemp);
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


        Animal[] animal = new Animal[5];
        System.out.println(animal);
        //Drawbacks of Array
        // Fixed Size
        //Insufficient Insertions and Deletions
        //Memory Wastage
        //Homogeneous Elements only



    }
}
