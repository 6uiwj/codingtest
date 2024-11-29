public class TestException {
    public static void main(String[] args) {
        try {
            System.out.println("문장 A");
            foo();
            System.out.println("문장 B");

        } catch (Exception e) {
            System.out.println("문장 C");

        }
        System.out.println("문장 D");
    }

    public static void foo() throws Exception {
        try {
            System.out.println("문장 E");
            throw new Exception();
        } catch (Exception e) {
            System.out.println("문장 F");
            throw e;
        } finally {
            System.out.println("문장 G");
        }
    }
}
