package org.Encapsulation;

public class CarEncapsulation {

    public static void main(String[] args) {



        //Car car1 = new Car(10, "Amaze","ownerName1",false, 10);

        Car car1 = new Car();
        //car1.mileage -= 10;
        car1.setOwnerName("ownerName1");
        car1.setAutomaticCar(false);
        car1.setModel("Amaze");
        car1.setMileage(10);

        System.out.println(car1.getMileage());
        System.out.println(car1.getModel());
        System.out.println(car1.getOwnerName());
        System.out.println(car1.isAutomaticCar());




        /*car1.mileage = 15;
        car1.isAutomaticCar = false;
        car1.model = "Amaze";
        car1.ownerName = "ownerName1";
        if(car1.ownerAge > 18){
            car1.ownerAge = 21;
        }*/

        /*car1.setAutomaticCar(false);
        car1.setMileage(15);
        car1.setModel("Amaze");
        car1.setOwnerAge(21);
        car1.setOwnerName("ownerName1");


        Car car2 = new Car();*/
        //car2.mileage = 12;
        /*car2.isAutomaticCar = true;
        car2.model = "Mercedes";
        car2.ownerName = "ownerName2";
        if(car1.ownerAge > 18) {
            car2.ownerAge = 21;
        }
        System.out.println(car2.getMileage());
        System.out.println(car2.getModel());
        System.out.println(car2.getOwnerName());
        System.out.println(car2.isAutomaticCar);

         car2.toString();
*/
        //Car car2 = new Car(12, "Mercedes", "Harshit", true);

        //Car car1 = new Car();
        //car1.setMileage(15);
        //car1.setModel("Amaze");


        System.out.println(car1.getMileage());
        System.out.println(car1.getModel());
        //System.out.println(car2.getMileage());

        //Car car3 = new Car();


        //car1.isAutomaticCar = false;
        //car1.mileage = 100;

        //Car car2 = new Car();
        //car2.isAutomaticCar = true;
        //car1.mileage = 150;
        //car1.ownerName = "Umesh Batra" ;
        /*System.out.println(car.isAutomaticCar);
        System.out.println(car.model);
        System.out.println(car.NATIONALITY);
        System.out.println(car.mileage);
    }*/
    }
}
