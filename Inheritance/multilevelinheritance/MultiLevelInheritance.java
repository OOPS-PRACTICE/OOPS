
public class MultiLevelInheritance {

    public static void main(String[] args){

        Child child = new Child();
        Parents p = new Child();
        Parents p1 = new Parents();

        p.test();
        child.test();
        p1.test();


        child.setAge(1);
        child.setName("Rakesh");
        System.out.println(child.getAge());
        System.out.println(child.getName());

        short a = 1;
        int b = a;

        short c = (short) b;


        Child child = new Child();
        child.setAge(1);
        child.setName("Rakesh");
        System.out.println(child.getAge());
        System.out.println(child.getName());

        /*child.childMethod();
        child.parentMethod();
        child.grandParentMethod();
*/
        Parents parent = new Parents();
        parent.setAge(25);
        parent.setName("Ramesh");
        System.out.println(parent.getAge());
        System.out.println(parent.getName());

  /*      parent.grandParentMethod();
        parent.parentMethod();
*/

    }
}
