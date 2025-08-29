
public class Main {

    public static void main(String[] args){

        //Animal an = new Animal();
         int i = 0;

         Animal[] am = new Animal[5];

        System.out.println(i);

        Animal cat = new Cat();
        cat.speak();
        cat.walk();

        Animal dog = new Dog();
        dog.speak();
        dog.walk();

        am[0] = cat;
        am[1] = dog;

        System.out.println(am[0]);
    }
}
