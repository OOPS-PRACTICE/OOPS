public class Circle extends GraphicObject{


    @Override
    void draw() {
        System.out.println("Drawing in circle class");
    }

    @Override
    void resize() {
        System.out.println("Resize in circle class");
    }
}
