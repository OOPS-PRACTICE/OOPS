public class Animal {

    int age;
    int legs;

    Animal(){
        super();
    }

    Animal(int age, int legs){
        this.age = age;
        this.legs = legs;
    }

    public void walk(){
        System.out.println("Animal is walking");
    }


    public void speak(){
        System.out.println(".......");
    }

    public void speak(int a){

    }

}
