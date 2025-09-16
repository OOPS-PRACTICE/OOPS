public class Computer {

    private String brand;
    private String model;

    private OperatingClass os;

    public Computer(String brand, String model, String osName){
         this.brand = brand;
         this.model = model;
         this.os = new OperatingClass(osName);
    }

    static class USB {
        private String type;

        public USB(String type){
            this.type = type;
        }

        void displayInfo(){
            System.out.println("USB Type: " + type);
        }
    }

    class OperatingClass {

        private String osName;

        public OperatingClass(String osName) {
            this.osName = osName;
        }

        public void displayName(){
            System.out.println("Computer Model: "+ model + ", OS: " + osName);
        }
    }

    public OperatingClass getOs() {
        return os;
    }
}
