
import java.lang.FunctionalInterface;
public class ReverseStringLambda {
    public static void main(String[] args) {
        GenericFunctionInterface<String> myInterface = (str) -> {
            String rev = "";
            System.out.println("str.lenght() :: "+str.length());
            for (int i = str.length()-1; i >= 0; i--) {
                System.out.println(i + " : " + str.charAt(i));
                rev += str.charAt(i);
            }
            return rev;

        };

        System.out.println("Lambda reversed :: "+myInterface.func("Lambda"));

        GenericFunctionInterface<Integer> factorial = (n)->{
            int result =1;
            for (int j=1;j<=n;j++)
                result =result*j;
            return  result;
        };
        System.out.println(factorial.func(5));
    }
}

@FunctionalInterface
interface GenericFunctionInterface<A> {
    A func(A t);
}