//Number of parameters:
// Methods with the same name but a different count of parameters.
//Data types of parameters:
// Methods with the same name and number of parameters, but with different data types for those parameters.
//Order of data types of parameters:
// Methods with the same name, number, and data types of parameters, but with a different order of those data types.


public class Polymorphism {

    public int multiply(int a, int b){
       int c = a * b;
        return c;
    }

    public int multiply(int a, int b, int c){
         int d = a * b * c ;
        return d;
    }

    public double multiply(double a, double b){
        double c = a * b;
        return c;
    }

    public static void main(String[] args){

        Polymorphism polymorphism =  new Polymorphism();
        polymorphism.multiply(1 ,2);
        polymorphism.multiply(1 ,2, 3);
        polymorphism.multiply(1.1 ,2.2);
    }
}
