public class BigDecimal {

    public static void main(String[] args) {

        //BigDecimal preferred over float or double for money-related Calculations primarily
        //because it avoids the floating point precision issues inherent

        double d = 0.1 + 0.3;
        System.out.println(d);

        java.math.BigDecimal b = new java.math.BigDecimal(d);
        System.out.println(b);
    }
}
