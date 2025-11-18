public class CustomExceptionsTest {

    public static void main(String[] args) throws CustomExceptions {

        int[] balance = {20, 30, 0, 50};

        for(int checkBalance : balance){
            if(checkBalance == 0 || checkBalance < 0 ){
                throw new CustomExceptions("Balance is Low");
            }
        }

    }
}
