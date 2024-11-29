package javaProgramming.constructor;

public class Child extends Parent{
    Child() {
        this(10);
    }

    Child(int x) {
        System.out.println("Child Constructor with value: " + x + " ");
    }
}
