package lambdaexpressions;

import java.util.HashMap;
import java.util.Map;

public class LambdaExpressions {

    public static void main(String[] args) {

        MyFunctionalInterface myFunctionalInterface = () -> 3.14159265358979323846264338327950288419796939937510;
        System.out.println("Value of Pi: " + myFunctionalInterface.getPiValue());
        Map<Object, Object> map = new HashMap<>();

    }

}
