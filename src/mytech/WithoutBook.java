package mytech;
class A1
{
    public A1(){}
    public A1(int x){}
}
class B1 extends A1 { }
public class WithoutBook
{
    public static void main (String args [])
    {
//        A a1 = new B();
        System.out.println("complete");

        String a = "newspaper";
        a = a.substring(5,7);
        System.out.println(a);
        char b = a.charAt(1);
        System.out.println(b);
        a = a + b;
        System.out.println(a);

        Object o = new Float(3.14F);
        Object [] oa = new Object[1];
        oa[0] = o; /* Line 5 */
        System.out.println("5 = "+o);
        o = null; /* Line 6 */
        System.out.println("6 = "+oa[0]);
        oa[0] = null; /* Line 7 */
        System.out.println("7 = "+oa[0]);
    }
}