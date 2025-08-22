public class Polymorphism {

    public static void main(String[] args){
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();

        Animal cat1 = new Cat();
        Animal dog1 = new Dog();
        //System.out.println(dog1.);

        Dog dog2 = (Dog) dog1;
        dog2.likeWalking();

    }
}
