public class ConditionalOperators {
    public static void main(String[] args){

        //The && and || operators perform Conditional-AND and Conditional-OR
        // operations on two boolean expressions.
        // These operators exhibit "short-circuiting" behavior,
        // which means that the second operand is evaluated only if needed.
           //     && Conditional-AND
           //    || Conditional-OR

        int value1 = 1;
        int value2 = 2;
        if((value1 == 1) && (value2 == 2))
            System.out.println("value1 is 1 AND value2 is 2");
        if((value1 == 2) || (value2 == 1))
            System.out.println("value1 is 1 OR value2 is 1");
        
        //ternary operator because it uses three operands.
        // Shorthand of ternary operator
        //conditional operator is ?:, which can be thought of as shorthand for an if-then-else statement

        boolean someCondition = false;
        //int result = someCondition ? value1 : value2;
        String result =  (value1 == 1 ) ? "Expected Result" : "Unexpected Result";
        System.out.println(result);

    }
}
