package javaProgramming.constructor;

public class Sub extends Super{
    Sub() {
        System.out.println('B');
    }

    Sub(char x) {
        this();
        System.out.println(x);
    }
}
