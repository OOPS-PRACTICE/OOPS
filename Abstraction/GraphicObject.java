
abstract class GraphicObject {

    //In abstract class should not have the public constructor.
    //Protected constructor should be enough
    public GraphicObject(){

    }

    //Concrete method
    void moveTo(int newX, int newY) {
        System.out.println("In MoveTo method");
    }

    //Declaring the method, with no body
    abstract void draw();
    abstract void resize();

}
