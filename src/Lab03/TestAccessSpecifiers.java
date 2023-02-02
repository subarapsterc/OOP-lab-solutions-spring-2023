package Lab03;  // problem 01

public class TestAccessSpecifiers {
    public static void main(String[] args) {
        AccessSpecifiers as = new AccessSpecifiers();

        //  10.
//        System.out.println(as.privateVar);
//        as.privateMethod();
//        System.out.println(as.privateVar);

        //  11.
        System.out.println(as.protectedVar);
        as.protectedMethod();
        System.out.println(as.protectedVar);

        System.out.println();

        //  12.
        System.out.println(as.defaultVar);
        as.defaultMethod();
        System.out.println(as.defaultVar);

        System.out.println();

        //  13.
        System.out.println(as.publicVar);
        as.publicMethod();
        System.out.println(as.publicVar);

    }
}
