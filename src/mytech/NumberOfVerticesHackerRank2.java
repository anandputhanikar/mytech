package mytech;

/**
 * In most of the programming competitions, problems are required to answer the result in 10^9+7 modulo. The reason behind this is to have problems for large integers so that only efficient algorithms can solve them in allowed limited time.
 * What is modulo operation:
 * The remainder obtained after the division operation on two operands is known as modulo operation. Operator for doing modulus operation is ‘%’. For ex: a % b = c which means, when a is divided by b it gives the remainder c, 7%2 = 1, 17%3 = 2.
 *
 * The reason of taking Mod is to prevent integer overflows. The largest integer data type in C/C++ is unsigned long long int which is of 64 bit and can handle integer from 0 to (2^64 – 1). But in some problems where the growth rate of output is very high, this high range of unsigned long long may be insufficient.
 * Suppose in a 64 bit variable ‘A’, 2^62 is stored and in another 64 bit variable ‘B’, 2^63 is stored. When we multiply A and B, the system does not give a runtime error or exception. It just does some bogus computation and stores the bogus result because the bit size of result comes after multiplication overflows.
 * In some of the problems, to compute the result modulo inverse is needed and this number helps a lot because it is prime. Also this number should be large enough otherwise modular inverse techniques may fail in some situations.
 *
 * Due to these reasons, problem setters require to give the answer as a result of modulo of some number N.
 * There are certain criteria on which value of N depends:
 *
 * It should just be large enough to fit in the largest integer data type i.e it makes sure that there is no overflow in result.
 * It should be a prime number because if we take mod of a number by Prime the result is generally spaced i.e. the results are very different results in comparison to mod the number by non-prime, that is why primes are generally used for mod.
 * 10^9+7 fulfills both the criteria. It is the first 10-digit prime number and fits in int data type as well. In fact, any prime number less than 2^30 will be fine in order to prevent possible overflows.
 */
public class NumberOfVerticesHackerRank2 {
    public static void main(String[] args) {

        System.out.println(drawingEdger(991));
    }

    private static int drawingEdger(int n) {
        int result=2;
        int val = n * (n-1)/2;
        int mod = 100000007;
        while(val-1>0){

            result = (2*result)%mod;
            val--;
        }

        return result % mod;
    }
}
