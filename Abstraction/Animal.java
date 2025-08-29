public abstract class Animal {

    protected Animal(){
        System.out.println("In a Animal Class Constructor");
    }

    protected abstract void speak();
    protected abstract void laugh();

    public void walk() {
        System.out.println("Walking......");
    }



}
