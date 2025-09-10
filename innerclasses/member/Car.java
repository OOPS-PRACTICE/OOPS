
public class Car {

    private String model;
    private boolean isEngineOn;

    public Car(String model){
        this.model = model;
        this.isEngineOn = false;
    }

    class Engine {
        void start(){
            if(!isEngineOn){
                isEngineOn = true;
                System.out.println(model + "Engine is started");
            }else{
                System.out.println(model + "Engine is already started");
            }
        }

        void stop(){
            if(isEngineOn){
                isEngineOn = false;
                System.out.println(model + "Engine is stopped now");
            }else{
                System.out.println(model + "Engine is already off");
            }
        }
    }
}
