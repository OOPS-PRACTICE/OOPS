

public class Test {

    public static void main(String[] args) {
        ShoppingCart sc = new ShoppingCart(101);

        //Define and Instantiate at the same line on the fly
        // It is mainly use if we want to implement or extends the methods
        sc.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid Amount " + amount);
            }

            });
    }
}
